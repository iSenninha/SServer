package cn.senninha.sserver.handler;

import cn.senninha.equipment.container.ClientContainer;
import cn.senninha.equipment.container.client.Client;
import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.equipment.message.req.ReqLogin;
import cn.senninha.sserver.lang.ByteBufUtil;
import cn.senninha.sserver.lang.codec.CodecFactory;
import cn.senninha.sserver.lang.dispatch.HandleContext;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.AttributeKey;
import org.slf4j.Logger;

import java.nio.ByteOrder;

import static cn.senninha.sserver.util.MessageUtil.byte32ChangeToString;

/**
 * 拆包并分发到对应的业务Handler
 * 
 * @author senninha on 2017年11月8日
 *
 */
public class DispatchHandler extends LengthFieldBasedFrameDecoder {
	private Logger logger = LoggerManager.getLogger(LoggerSystem.NET);

	public DispatchHandler(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment,
			int initialBytesToStrip, boolean failFast) {
		super(ByteOrder.LITTLE_ENDIAN, maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip, failFast);
	}

	/**
	 * decode()--->channelRead()
	 */
	@Override
	protected Object decode(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
		msg = (ByteBuf) super.decode(ctx, msg);
		if (msg == null) {
			return null;
		} else {
			if (msg != null) {
				BaseMessage message = CodecFactory.getInstance().decode(ByteBufUtil.convert(msg));
				String sessionId = (String) (ctx.channel().attr(AttributeKey.valueOf("sessionId"))).get();
				// TODO
				if (sessionId == null) {
					if (message.getCmd() == CmdConstant.REQ_LOGIN) {
						ReqLogin login = (ReqLogin) message;
						String equipmentId = byte32ChangeToString(login.getEquipmentId().getB());
						if(equipmentId != null){
						    sessionId = equipmentId;
							Client c = new Client();
							c.setCtx(ctx);
							c.setEquipmentId(equipmentId);
							ClientContainer container = ClientContainer.getInstance();
							container.add(equipmentId, c);
							ctx.channel().attr(AttributeKey.valueOf("sessionId")).set(equipmentId);
						}
					}
				}
				HandleContext.getInstance().dispatch(sessionId, message);
			}
		}
		return null;
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		String sessionId = (String) (ctx.channel().attr(AttributeKey.valueOf("sessionId"))).get();
		if (sessionId == null) {
			logger.error("匿名连接掉线：{}", ctx.channel().remoteAddress().toString());
		} else {
			ClientContainer.getInstance().remove(sessionId);
			logger.error("{}掉线", sessionId);
		}
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if (evt instanceof IdleStateEvent) {
			IdleStateEvent e = (IdleStateEvent) evt;
			switch (e.state()) {
			case ALL_IDLE:
				disconnect(ctx);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 
	 * @param ctx
	 * @param sessionId
	 */
	private void disconnect(ChannelHandlerContext ctx) {
		String sessionId = (String) (ctx.channel().attr(AttributeKey.valueOf("sessionId"))).get();
		ctx.disconnect();
		if (sessionId == null) {
			return;
		}
		// TODO
	}

}

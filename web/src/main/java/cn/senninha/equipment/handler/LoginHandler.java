package cn.senninha.equipment.handler;

import cn.senninha.equipment.container.PushHelper;
import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.equipment.message.req.ReqHeart;
import cn.senninha.equipment.message.req.ReqLogin;
import cn.senninha.equipment.message.res.ResHeart;
import cn.senninha.equipment.message.res.ResLogin;
import cn.senninha.equipment.message.res.ResTime;
import cn.senninha.sserver.lang.dispatch.MessageHandler;
import cn.senninha.sserver.lang.dispatch.MessageInvoke;
import cn.senninha.sserver.lang.message.Message;
import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import org.slf4j.Logger;

/**
 * Coded by senninha on 18-1-27
 */
@MessageHandler
public class LoginHandler {
    private Logger logger = LoggerManager.getLogger(LoggerSystem.NET);
    @MessageInvoke(cmd = CmdConstant.REQ_LOGIN)
    public void login(String sessionId, ReqLogin message){
        logger.info("收到{}协议信息{}", sessionId, message);
        ResLogin res = new ResLogin();
        PushHelper.sendMessage(sessionId, res);
        ResTime resTime = new ResTime();
        resTime.setTime(System.currentTimeMillis());
    }

    @MessageInvoke(cmd = CmdConstant.REQ_HEART)
    public void reqHeart(String equipmentId, ReqHeart req){
        logger.info("受到{}心跳信息", equipmentId);
        ResHeart res = new ResHeart();
        PushHelper.sendMessage(equipmentId, res);
    }
}

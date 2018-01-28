package cn.senninha.equipment.container;

import cn.senninha.equipment.container.client.Client;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 推送信息帮助类
 * Coded by senninha on 18-1-22
 */
public class PushHelper {
    private static Logger logger = LoggerManager.getLogger(LoggerSystem.NET);
    /**
     * 发送信息
     * @param client
     * @param message
     */
    private static void sendMessage(Client client, BaseMessage message){
        if(client == null || message == null){
            return;
        }

        ChannelHandlerContext ctx = client.getCtx();
        ctx.write(message);
        logger.info("发送{},cmd={}", client.getEquipmentId(), message.getCmd());
    }

    /**
     * 发送信息
     * @param equipmentId
     * @param message
     */
    public static void sendMessage(String equipmentId, BaseMessage message){
        sendMessage(ClientContainer.getInstance().get(equipmentId), message);
    }

    /**
     * 发送所有在线信息
     * @param message
     */
    public static List<String> sendAllOL(BaseMessage message){
        List<String> list = new ArrayList<>();
        if(message == null){
            return list;
        }
        for(Client client : ClientContainer.getInstance().getALL()){
            sendMessage(client, message);
            list.add(client.getEquipmentId());
        }
        return list;
    }
}

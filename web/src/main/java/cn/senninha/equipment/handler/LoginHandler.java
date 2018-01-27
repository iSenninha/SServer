package cn.senninha.equipment.handler;

import cn.senninha.equipment.container.ClientContainer;
import cn.senninha.equipment.container.PushHelper;
import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.dispatch.MessageHandler;
import cn.senninha.sserver.lang.dispatch.MessageInvoke;
import cn.senninha.sserver.lang.message.BaseMessage;

/**
 * Coded by senninha on 18-1-27
 */
@MessageHandler
public class LoginHandler {
    @MessageInvoke(cmd = CmdConstant.REQ_LOGIN)
    public void login(String sessionId, BaseMessage message){
        System.out.println(message.toString());
        PushHelper.sendMessage(sessionId, message);
    }
}

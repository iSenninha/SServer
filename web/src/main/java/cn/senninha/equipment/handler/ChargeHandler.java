package cn.senninha.equipment.handler;

import cn.senninha.equipment.container.PushHelper;
import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.equipment.message.req.ReqChargeInfo;
import cn.senninha.equipment.message.req.ReqChargeStatus;
import cn.senninha.equipment.message.req.ReqTime;
import cn.senninha.equipment.message.res.ResChargeInfo;
import cn.senninha.equipment.message.res.ResChargeStatus;
import cn.senninha.sserver.lang.dispatch.MessageHandler;
import cn.senninha.sserver.lang.dispatch.MessageInvoke;
import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import org.slf4j.Logger;

/**
 * Handler
 * @author senninha on 2018年1月11日
 *
 */
@MessageHandler
public class ChargeHandler {
    private Logger logger = LoggerManager.getLogger(LoggerSystem.NET);


    @MessageInvoke(cmd = CmdConstant.REQ_CHARGE_STATUS)
    public void receiveStatus(String sessionId, ReqChargeStatus message){
        logger.info("收到{}充电状态信息{}", sessionId, message);
        ResChargeStatus res = new ResChargeStatus();
        PushHelper.sendMessage(sessionId, res);
    }

    @MessageInvoke(cmd = CmdConstant.REQ_CHARGE_INFO)
    public void receiveChargeInfo(String sessionId, ReqChargeInfo message){
        logger.info("收到{}充电完成信息{}", sessionId, message);
        ResChargeInfo res = new ResChargeInfo();
        res.setConnector((byte) 2);
    }

    @MessageInvoke(cmd = CmdConstant.REQ_TIME)
    public void receiveStartCharge(String sessionId, ReqTime message){
        logger.info("{}收到时间确认回复信息{}", sessionId, message);
    }
}

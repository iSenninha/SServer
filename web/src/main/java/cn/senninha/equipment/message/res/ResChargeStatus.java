package cn.senninha.equipment.message.res;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.message.Message;

/**
 * 应答充电过程中的状态信息包，这个应答报文根本就是多余的
 * Coded by senninha on 18-1-27
 */
@Message(cmd = CmdConstant.RES_STATUS)
public class ResChargeStatus {
    private short __;
    private short ___;
}

package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * 充电过程中的状态
 * Coded by senninha on 18-1-27
 */
@Message(cmd = CmdConstant.REQ_CHARGE_STATUS)
public class ReqChargeStatus extends BaseMessage {
    private short blank0;
    private short blank1;
    private Field32Bytes equipmentId;
    private byte connectorNum;
    private byte connector;
    /** 1之流 2交流 */
    private byte type;
    /** 工作状态 */
    private byte status;
    private byte soc;
    private byte connectStatus;
    /** 0.01 */
    private int fee;
    private long __fule;
    //TODO。。。。。
}

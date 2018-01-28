package cn.senninha.equipment.message.req;

import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

import static cn.senninha.equipment.message.CmdConstant.REQ_START_CHARGE;

/**
 * 远程执行充电结果
 * @author senninha on 18-1-28
 **/
@Message(cmd = REQ_START_CHARGE)
public class ReqStartCharge extends BaseMessage{
    private short blank0;
    private short blank1;
    private Field32Bytes equipmentId;
    private byte connector;
    /** 0成功，其他不知道 */
    private int result;

    public short getBlank0() {
        return blank0;
    }

    public void setBlank0(short blank0) {
        this.blank0 = blank0;
    }

    public short getBlank1() {
        return blank1;
    }

    public void setBlank1(short blank1) {
        this.blank1 = blank1;
    }

    public Field32Bytes getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Field32Bytes equipmentId) {
        this.equipmentId = equipmentId;
    }

    public byte getConnector() {
        return connector;
    }

    public void setConnector(byte connector) {
        this.connector = connector;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ReqStartCharge{" +
                "blank0=" + blank0 +
                ", blank1=" + blank1 +
                ", equipmentId=" + equipmentId +
                ", connector=" + connector +
                ", result=" + result +
                '}';
    }
}

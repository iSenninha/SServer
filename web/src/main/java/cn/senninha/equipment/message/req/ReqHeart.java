package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * @author senninha on 18-1-28
 **/
@Message(cmd = CmdConstant.REQ_HEART)
public class ReqHeart extends BaseMessage{
    private short blank0;
    private short blank1;
    private Field32Bytes equipmentId;
    private short blank2;

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

    public short getBlank2() {
        return blank2;
    }

    public void setBlank2(short blank2) {
        this.blank2 = blank2;
    }

    @Override
    public String toString() {
        return "ReqHeart{" +
                "blank0=" + blank0 +
                ", blank1=" + blank1 +
                ", equipmentId=" + equipmentId +
                ", blank2=" + blank2 +
                '}';
    }
}

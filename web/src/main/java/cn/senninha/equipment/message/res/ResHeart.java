package cn.senninha.equipment.message.res;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * @author senninha on 18-1-28
 **/
@Message(cmd = CmdConstant.RES_HEARTBEAT)
public class ResHeart extends BaseMessage{
    private short blank0;
    private short blank1;
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

    public short getBlank2() {
        return blank2;
    }

    public void setBlank2(short blank2) {
        this.blank2 = blank2;
    }
}

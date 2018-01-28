package cn.senninha.equipment.message.res;

import cn.senninha.sserver.lang.message.BaseMessage;

/**
 * 时间同步
 * Coded by senninha on 18-1-27
 */
public class ResTime extends BaseMessage {
    private short blank0;
    private short blank1;
    private byte type = 1;
    private int address = 2;
    private short bytes = 8;
    private long time;

    public short getBlank1() {
        return blank1;
    }

    public void setBlank1(short blank1) {
        this.blank1 = blank1;
    }

    public short getBlank0() {
        return blank0;
    }

    public void setBlank0(short blank0) {
        this.blank0 = blank0;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public short getBytes() {
        return bytes;
    }

    public void setBytes(short bytes) {
        this.bytes = bytes;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ResTime{" +
                "type=" + type +
                ", address=" + address +
                ", bytes=" + bytes +
                ", time=" + time +
                '}';
    }
}

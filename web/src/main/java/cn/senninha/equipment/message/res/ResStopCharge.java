package cn.senninha.equipment.message.res;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * 停止充电
 */
@Message(cmd = CmdConstant.RES_STOP_CHARGE)
public class ResStopCharge extends BaseMessage {
	private short blank0;
	private short blank1;
	private byte connector;
	private int cmdStartFlag = 2;
	private byte cmdSize = 1;
	private short cmdLength = 4;
	private int command = 0x55;

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

    public byte getConnector() {
        return connector;
    }

    public void setConnector(byte connector) {
        this.connector = connector;
    }

    public int getCmdStartFlag() {
        return cmdStartFlag;
    }

    public void setCmdStartFlag(int cmdStartFlag) {
        this.cmdStartFlag = cmdStartFlag;
    }

    public byte getCmdSize() {
        return cmdSize;
    }

    public void setCmdSize(byte cmdSize) {
        this.cmdSize = cmdSize;
    }

    public short getCmdLength() {
        return cmdLength;
    }

    public void setCmdLength(short cmdLength) {
        this.cmdLength = cmdLength;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }
}

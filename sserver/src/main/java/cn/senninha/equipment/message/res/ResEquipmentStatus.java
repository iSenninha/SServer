package cn.senninha.equipment.message.res;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * 应答充电桩信息
 * @author senninha on 2018年1月13日
 *
 */
@Message(cmd = CmdConstant.RES_STATUS)
public class ResEquipmentStatus extends BaseMessage {
	private short blank0;
	private short blan1;
	private byte connector;
	private Field32Bytes userId;
	/** 余额，除以0.01才是实际值 */
	private int balance;
	/** 当前充电花费金额 */
	private int curChargeMoney;
	
	
	public short getBlank0() {
		return blank0;
	}
	public void setBlank0(short blank0) {
		this.blank0 = blank0;
	}
	public short getBlan1() {
		return blan1;
	}
	public void setBlan1(short blan1) {
		this.blan1 = blan1;
	}
	public byte getConnector() {
		return connector;
	}
	public void setConnector(byte connector) {
		this.connector = connector;
	}
	public Field32Bytes getUserId() {
		return userId;
	}
	public void setUserId(Field32Bytes userId) {
		this.userId = userId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCurChargeMoney() {
		return curChargeMoney;
	}
	public void setCurChargeMoney(int curChargeMoney) {
		this.curChargeMoney = curChargeMoney;
	}
	
	
}

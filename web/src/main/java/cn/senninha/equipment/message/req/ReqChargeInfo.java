package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.codec.field.ShortArray48;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;
/**
 * 充电记录上传
 * @author senninha on 2018年1月13日
 *
 */
@Message(cmd = CmdConstant.REQ_CHARGE_INFO)
public class ReqChargeInfo extends BaseMessage {
	private short blank0;
	private short blank1;
	/** 充电桩id */
	private Field32Bytes equipmentId;
	private byte connector;
	/** 充电卡号 */
	private Field32Bytes userId;
	private long startTime;
	private long stopTime;
	/** 时间长度 second */
	private int timeLength;
	private byte beginSoc;
	private byte stopSoc;
	/** 充电结束原因 */
	private int chargeStopReason;
	/** 本次充电量 */
	private int curChargeElectricity;
	/** 充电前电表读数 */
	private int electricityBeforeCharge;
	/** 充电后电表读数 */
	private int electricityAfterCharge;
	
	private int blank___fule;
	
	/** 充电前余额 */
	private int balanceBeforeCharge;
	/** 当前充电索引 唯一编号*/
	private int curIndex;
	/** 当前充电记录总条目 */
	private int total;
	private byte blank2;
	/** 充电策略 0,充满，1,时间控制，2,金额控制 3，电量控制*/
	private byte strategy;
	/** 充电策略参数 1s,0.01元，0.01kw/h*/
	private int strategyParam;
    private long vin_0;
    private long vin_1;
    private byte vin_2;
    private long car;

    /** 48小时 */
    private ShortArray48 charge48Hours;

    /** 0本地刷卡启动，1后台启动，2本地管理员启动 */
    private byte startMode;

	@Override
	public String toString() {
		return "ReqChargeInfo{" +
				"blank0=" + blank0 +
				", blank1=" + blank1 +
				", equipmentId=" + equipmentId +
				", connector=" + connector +
				", userId=" + userId +
				", startTime=" + startTime +
				", stopTime=" + stopTime +
				", timeLength=" + timeLength +
				", beginSoc=" + beginSoc +
				", stopSoc=" + stopSoc +
				", chargeStopReason=" + chargeStopReason +
				", curChargeElectricity=" + curChargeElectricity +
				", electricityBeforeCharge=" + electricityBeforeCharge +
				", electricityAfterCharge=" + electricityAfterCharge +
				", blank___fule=" + blank___fule +
				", balanceBeforeCharge=" + balanceBeforeCharge +
				", curIndex=" + curIndex +
				", total=" + total +
				", blank2=" + blank2 +
				", strategy=" + strategy +
				", strategyParam=" + strategyParam +
				", vin_0=" + vin_0 +
				", vin_1=" + vin_1 +
				", vin_2=" + vin_2 +
				", car=" + car +
				", charge48Hours=" + charge48Hours +
				", startMode=" + startMode +
				'}';
	}
}
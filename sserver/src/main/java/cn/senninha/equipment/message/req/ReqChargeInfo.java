package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
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
	
	//TODO 协议错误17
	
	/** 充电前余额 */
	private int balanceBeforeCharge;
	/** 当前充电索引 唯一编号*/
	private int curIndex;
	/** 当前充电记录总条目 */
	private int total;
	private byte blank2;
	/** 充电策略 0,充满，1,时间控制，2,金额控制 3，电量控制*/
	private byte strategy;
	/** 充电策略参数 */
	private int strategyParam;
	//TODO 不想写了，全是坑
}

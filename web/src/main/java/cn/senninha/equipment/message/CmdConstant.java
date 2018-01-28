package cn.senninha.equipment.message;

/**
 * cmd常量
 * @author senninha on 2018年1月11日
 *
 */
public class CmdConstant {
	/** --------------------------------------------------- */
	//-------------服务器--->客户端--------------------------//
	/** 停止充电 */
	public static final short RES_STOP_CHARGE = 5;
	/** 开始充电 */
	public static final short RES_START_CHARGE = 7;
	/** 心跳 */
	public static final short RES_HEARTBEAT = 101;
	/** 应答充电桩状态信息 */
	public static final short RES_STATUS = 103;
	/** 应答签到信息 */
	public static final short RES_LOGIN = 105;
	/** 应答上报的充电信息 */
	public static final short RES_CHARGE_INFO = 201;
	/** 应答上传未上传历史充电记录 */
	public static final short RES_HISTORY_CHARGE_INFO = 401;
	/** 下发时间 */
	public static final short RES_TIME = 3;
	
	
	/** --------------------------------------------------- */
	//-------------客户端--->服务端--------------------------//
	/** 签到 */
	public static final short REQ_LOGIN = 106;
	/** 上传充电记录 */
	public static final short REQ_CHARGE_INFO = 202;
	/** 心跳 */
	public static final short REQ_HEART = 101;
	/** 应答时间设置 */
	public static final short REQ_TIME = 4;
	/** 充电过程中状态 */
	public static final short REQ_CHARGE_STATUS = 104;
	/** 应答开始充电执行结果 */
	public static final short REQ_START_CHARGE = 8;

}

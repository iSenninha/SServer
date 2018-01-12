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
	/** 停止充电 */
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
}

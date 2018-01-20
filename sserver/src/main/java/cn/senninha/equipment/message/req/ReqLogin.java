package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * 签到
 * @author senninha on 2018年1月13日
 *
 */
@Message(cmd = CmdConstant.REQ_LOGIN)
public class ReqLogin extends BaseMessage {
	private short blank0;
	private short blank1;
	private Field32Bytes equipmentId;
	/** 类型，0普通，1自动功率分配，2轮询 */
	private byte type;
	private int versions;
	private short projectType;
	/** 启动次数 */
	private int startNum;
	/** 1应答模式 2主动上报 */
	private byte answerModel;
	private short loginInterval;
	private byte innerParam;
	private byte connector;
	private byte heartInterval;
	private byte heartTimeOut;
	/** 充电记录数字 */
	private int chargeSize;
	private long time;
	private long blank2;
	private long blank3;
	private long blank4;
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
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		this.type = type;
	}
	public int getVersions() {
		return versions;
	}
	public void setVersions(int versions) {
		this.versions = versions;
	}
	public short getProjectType() {
		return projectType;
	}
	public void setProjectType(short projectType) {
		this.projectType = projectType;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public byte getAnswerModel() {
		return answerModel;
	}
	public void setAnswerModel(byte answerModel) {
		this.answerModel = answerModel;
	}
	public short getLoginInterval() {
		return loginInterval;
	}
	public void setLoginInterval(short loginInterval) {
		this.loginInterval = loginInterval;
	}
	public byte getInnerParam() {
		return innerParam;
	}
	public void setInnerParam(byte innerParam) {
		this.innerParam = innerParam;
	}
	public byte getConnector() {
		return connector;
	}
	public void setConnector(byte connector) {
		this.connector = connector;
	}
	public byte getHeartInterval() {
		return heartInterval;
	}
	public void setHeartInterval(byte heartInterval) {
		this.heartInterval = heartInterval;
	}
	public byte getHeartTimeOut() {
		return heartTimeOut;
	}
	public void setHeartTimeOut(byte heartTimeOut) {
		this.heartTimeOut = heartTimeOut;
	}
	public int getChargeSize() {
		return chargeSize;
	}
	public void setChargeSize(int chargeSize) {
		this.chargeSize = chargeSize;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getBlank2() {
		return blank2;
	}
	public void setBlank2(long blank2) {
		this.blank2 = blank2;
	}
	public long getBlank3() {
		return blank3;
	}
	public void setBlank3(long blank3) {
		this.blank3 = blank3;
	}
	public long getBlank4() {
		return blank4;
	}
	public void setBlank4(long blank4) {
		this.blank4 = blank4;
	}
	
	
}

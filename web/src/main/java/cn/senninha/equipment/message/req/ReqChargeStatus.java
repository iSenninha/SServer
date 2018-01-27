package cn.senninha.equipment.message.req;

import cn.senninha.equipment.message.CmdConstant;
import cn.senninha.sserver.lang.codec.field.Field32Bytes;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.lang.message.Message;

/**
 * 充电过程中的状态
 * Coded by senninha on 18-1-27
 */
@Message(cmd = CmdConstant.REQ_CHARGE_STATUS)
public class ReqChargeStatus extends BaseMessage {
    private short blank0;
    private short blank1;
    private Field32Bytes equipmentId;
    private byte connectorNum;
    private byte connector;
    /** 1之流 2交流 */
    private byte type;
    /** 工作状态 0,空闲中，1,充电中*/
    private byte status;
    private byte soc;
    private byte connectStatus;
    /** 0.01 */
    private int fee;
    private long __fule;
    /** 0.1 */
    private short voltageDC;
    private short currentDC;
    private short bmsVoltage;
    private short bmsCurrent;
    private byte bmsMode;
    private short voltageACA;
    private short voltageACB;
    private short voltageACC;
    private short currentACA;
    private short currentACB;
    private short currentACC;
    /** 剩余充电分钟 */
    private short leaveTime;
    /** 已经充电的时长 */
    private int chargeTimeSecond;
    private int currentElectricity;
    /** 电表充电前读数 */
    private int electricityBefore;
    private int electricityCur;
    private byte strategy;
    private int strategyParam;
    /** 是否愉悦 1愉悦 */
    private byte isBook;
    private Field32Bytes userId;
    /** 愉悦超市时间 分钟*/
    private byte overTime;
    /** 开始充电时间 */
    private long startCharge;
    /** 充电前余额 */
    private int balance;
    private int blank____zz;
    /** 功率 0.1 */
    private int power;
    private int blank__z;
    private int blank_zz;
    private int blank_zzz;
    private byte chufengkouwendu;
    private byte huanjingwendu;
    private byte chongdianqiangwendu;

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

    public byte getConnectorNum() {
        return connectorNum;
    }

    public void setConnectorNum(byte connectorNum) {
        this.connectorNum = connectorNum;
    }

    public byte getConnector() {
        return connector;
    }

    public void setConnector(byte connector) {
        this.connector = connector;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getSoc() {
        return soc;
    }

    public void setSoc(byte soc) {
        this.soc = soc;
    }

    public byte getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(byte connectStatus) {
        this.connectStatus = connectStatus;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public long get__fule() {
        return __fule;
    }

    public void set__fule(long __fule) {
        this.__fule = __fule;
    }

    public short getVoltageDC() {
        return voltageDC;
    }

    public void setVoltageDC(short voltageDC) {
        this.voltageDC = voltageDC;
    }

    public short getCurrentDC() {
        return currentDC;
    }

    public void setCurrentDC(short currentDC) {
        this.currentDC = currentDC;
    }

    public short getBmsVoltage() {
        return bmsVoltage;
    }

    public void setBmsVoltage(short bmsVoltage) {
        this.bmsVoltage = bmsVoltage;
    }

    public short getBmsCurrent() {
        return bmsCurrent;
    }

    public void setBmsCurrent(short bmsCurrent) {
        this.bmsCurrent = bmsCurrent;
    }

    public byte getBmsMode() {
        return bmsMode;
    }

    public void setBmsMode(byte bmsMode) {
        this.bmsMode = bmsMode;
    }

    public short getVoltageACA() {
        return voltageACA;
    }

    public void setVoltageACA(short voltageACA) {
        this.voltageACA = voltageACA;
    }

    public short getVoltageACB() {
        return voltageACB;
    }

    public void setVoltageACB(short voltageACB) {
        this.voltageACB = voltageACB;
    }

    public short getVoltageACC() {
        return voltageACC;
    }

    public void setVoltageACC(short voltageACC) {
        this.voltageACC = voltageACC;
    }

    public short getCurrentACA() {
        return currentACA;
    }

    public void setCurrentACA(short currentACA) {
        this.currentACA = currentACA;
    }

    public short getCurrentACB() {
        return currentACB;
    }

    public void setCurrentACB(short currentACB) {
        this.currentACB = currentACB;
    }

    public short getCurrentACC() {
        return currentACC;
    }

    public void setCurrentACC(short currentACC) {
        this.currentACC = currentACC;
    }

    public short getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(short leaveTime) {
        this.leaveTime = leaveTime;
    }

    public int getChargeTimeSecond() {
        return chargeTimeSecond;
    }

    public void setChargeTimeSecond(int chargeTimeSecond) {
        this.chargeTimeSecond = chargeTimeSecond;
    }

    public int getCurrentElectricity() {
        return currentElectricity;
    }

    public void setCurrentElectricity(int currentElectricity) {
        this.currentElectricity = currentElectricity;
    }

    public int getElectricityBefore() {
        return electricityBefore;
    }

    public void setElectricityBefore(int electricityBefore) {
        this.electricityBefore = electricityBefore;
    }

    public int getElectricityCur() {
        return electricityCur;
    }

    public void setElectricityCur(int electricityCur) {
        this.electricityCur = electricityCur;
    }

    public byte getStrategy() {
        return strategy;
    }

    public void setStrategy(byte strategy) {
        this.strategy = strategy;
    }

    public int getStrategyParam() {
        return strategyParam;
    }

    public void setStrategyParam(int strategyParam) {
        this.strategyParam = strategyParam;
    }

    public byte getIsBook() {
        return isBook;
    }

    public void setIsBook(byte isBook) {
        this.isBook = isBook;
    }

    public Field32Bytes getUserId() {
        return userId;
    }

    public void setUserId(Field32Bytes userId) {
        this.userId = userId;
    }

    public byte getOverTime() {
        return overTime;
    }

    public void setOverTime(byte overTime) {
        this.overTime = overTime;
    }

    public long getStartCharge() {
        return startCharge;
    }

    public void setStartCharge(long startCharge) {
        this.startCharge = startCharge;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBlank____zz() {
        return blank____zz;
    }

    public void setBlank____zz(int blank____zz) {
        this.blank____zz = blank____zz;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBlank__z() {
        return blank__z;
    }

    public void setBlank__z(int blank__z) {
        this.blank__z = blank__z;
    }

    public int getBlank_zz() {
        return blank_zz;
    }

    public void setBlank_zz(int blank_zz) {
        this.blank_zz = blank_zz;
    }

    public int getBlank_zzz() {
        return blank_zzz;
    }

    public void setBlank_zzz(int blank_zzz) {
        this.blank_zzz = blank_zzz;
    }

    public byte getChufengkouwendu() {
        return chufengkouwendu;
    }

    public void setChufengkouwendu(byte chufengkouwendu) {
        this.chufengkouwendu = chufengkouwendu;
    }

    public byte getHuanjingwendu() {
        return huanjingwendu;
    }

    public void setHuanjingwendu(byte huanjingwendu) {
        this.huanjingwendu = huanjingwendu;
    }

    public byte getChongdianqiangwendu() {
        return chongdianqiangwendu;
    }

    public void setChongdianqiangwendu(byte chongdianqiangwendu) {
        this.chongdianqiangwendu = chongdianqiangwendu;
    }

    @Override
    public String toString() {
        return "ReqChargeStatus{" +
                "blank0=" + blank0 +
                ", blank1=" + blank1 +
                ", equipmentId=" + equipmentId +
                ", connectorNum=" + connectorNum +
                ", connector=" + connector +
                ", type=" + type +
                ", status=" + status +
                ", soc=" + soc +
                ", connectStatus=" + connectStatus +
                ", fee=" + fee +
                ", __fule=" + __fule +
                ", voltageDC=" + voltageDC +
                ", currentDC=" + currentDC +
                ", bmsVoltage=" + bmsVoltage +
                ", bmsCurrent=" + bmsCurrent +
                ", bmsMode=" + bmsMode +
                ", voltageACA=" + voltageACA +
                ", voltageACB=" + voltageACB +
                ", voltageACC=" + voltageACC +
                ", currentACA=" + currentACA +
                ", currentACB=" + currentACB +
                ", currentACC=" + currentACC +
                ", leaveTime=" + leaveTime +
                ", chargeTimeSecond=" + chargeTimeSecond +
                ", currentElectricity=" + currentElectricity +
                ", electricityBefore=" + electricityBefore +
                ", electricityCur=" + electricityCur +
                ", strategy=" + strategy +
                ", strategyParam=" + strategyParam +
                ", isBook=" + isBook +
                ", userId=" + userId +
                ", overTime=" + overTime +
                ", startCharge=" + startCharge +
                ", balance=" + balance +
                ", blank____zz=" + blank____zz +
                ", power=" + power +
                ", blank__z=" + blank__z +
                ", blank_zz=" + blank_zz +
                ", blank_zzz=" + blank_zzz +
                ", chufengkouwendu=" + chufengkouwendu +
                ", huanjingwendu=" + huanjingwendu +
                ", chongdianqiangwendu=" + chongdianqiangwendu +
                '}';
    }
}

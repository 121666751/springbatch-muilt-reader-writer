package cn.ledaikuan.ldkbatch.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="loans_deviceinfo")
@DynamicUpdate(true)
@DynamicInsert(true)
public class DeviceInfo implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //DeviceInfo主键的标识属性
    private Integer id;
    
    @Column(name="customerId", nullable=false, length=20 , unique=true)
    //麦广客户ID
    private String customerId;
    
    @Column(name="deviceType")
    //设备类型
    private Integer deviceType;
    
    @Column(name="model")
    //设备模型(android)
    private String model;
    
    @Column(name="imei")
    //手机imei(android)
    private String imei;
    
    @Column(name="imsi")
    //手机imsi(android)
    private String imsi;
    
    @Column(name="serialNo")
    //手机序列号(android)
    private String serialNo;
    
    @Column(name="androidId")
    //手机androidId(android)
    private String androidId;
    
    @Column(name="mac")
    //手机mac地址(android/ios)
    private String mac;
    
    @Column(name="idfa")
    //手机广告标识符(ios)
    private String idfa;
    
    @Column(name="platform")
    //手机平台(ios)
    private String platform;
    
    @Column(name="capacity")
    //手机容量(ios)
    private String capacity;
    
    @Column(name="version")
    //手机版本(ios)
    private String version;
    
    @Column(name="brand")
    //手机品牌
    private String brand;
    
    @Column(name="ip")
    //定位IP
    private String ip;
    
    public Integer getRegisterflag() {
        return registerflag;
    }

    public void setRegisterflag(Integer registerflag) {
        this.registerflag = registerflag;
    }

    public String getIosDeviceId() {
        return iosDeviceId;
    }

    public void setIosDeviceId(String iosDeviceId) {
        this.iosDeviceId = iosDeviceId;
    }

    @Column(name="registerflag")
    //注册设备标志
    private Integer registerflag;
    
    @Column(name="iosDeviceId")
    //IOS设备唯一性标示
    private String iosDeviceId;
    
    public String getDeviceFingerprint() {
        return deviceFingerprint;
    }

    public void setDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }

    @Column(name="deviceFingerprint")
    //同盾设备指纹
    private String deviceFingerprint;
}

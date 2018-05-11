package cn.ledaikuan.ldkbatch.model;

import com.alibaba.fastjson.JSONObject;

public class UserInfoBean {

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdApplyStatus() {
        return idApplyStatus;
    }

    public void setIdApplyStatus(String idApplyStatus) {
        this.idApplyStatus = idApplyStatus;
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getDebitCardPhoneNo() {
        return debitCardPhoneNo;
    }

    public void setDebitCardPhoneNo(String debitCardPhoneNo) {
        this.debitCardPhoneNo = debitCardPhoneNo;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getJobUnit() {
        return jobUnit;
    }

    public void setJobUnit(String jobUnit) {
        this.jobUnit = jobUnit;
    }

    public String getUnitAddr() {
        return unitAddr;
    }

    public void setUnitAddr(String unitAddr) {
        this.unitAddr = unitAddr;
    }

    private String registerTime;
    
    private String mobileNo;
    
    private String resultStatus;
    
    private String channel;
    
    private String idNo;
    
    private String customerName;
    
    private String gender;
    
    private int age;
    
    private String birthday;
    
    private String idApplyStatus;
    
    private String debitCardNo;
    
    private String openBank;
    
    private String debitCardPhoneNo;
    
    private String prov;
    
    private String city;
    
    private String homeAddr;
    
    private String jobUnit;
    
    private String unitAddr;
    
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
    
}

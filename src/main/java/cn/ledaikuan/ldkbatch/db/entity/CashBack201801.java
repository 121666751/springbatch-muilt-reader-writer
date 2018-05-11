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
@Table(name="loans_cashback_201801")
@DynamicUpdate(true)
@DynamicInsert(true)
public class CashBack201801 implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 20180120L;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getPushType() {
        return pushType;
    }

    public void setPushType(int pushType) {
        this.pushType = pushType;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //主键的标识属性
    private Integer id;
    
    @Column(name="customerId")
    //短信发送手机号
    private String customerId;
    
    @Column(name="mobileNo")
    //短信发送手机号
    private String mobileNo;
    
    public String getPushDeviceId() {
        return pushDeviceId;
    }

    public void setPushDeviceId(String pushDeviceId) {
        this.pushDeviceId = pushDeviceId;
    }

    @Column(name="pushDeviceId")
    //短信发送手机号
    private String pushDeviceId;
    
    @Column(name="userType")
    //短信发送手机号
    private String userType;
    
    @Column(name="pushType")
    //短信发送手机号
    private int pushType;
    
}

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
@Table(name="loans_cashback_voucher")
@DynamicUpdate(true)
@DynamicInsert(true)
public class CashBackVoucher implements Serializable {

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

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public int getValidTerm() {
        return validTerm;
    }

    public void setValidTerm(int validTerm) {
        this.validTerm = validTerm;
    }

    public int getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(int voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public String getCashTime() {
        return cashTime;
    }

    public void setCashTime(String cashTime) {
        this.cashTime = cashTime;
    }

    public String getCashMobile() {
        return cashMobile;
    }

    public void setCashMobile(String cashMobile) {
        this.cashMobile = cashMobile;
    }

    public String getPayGateOrderId() {
        return payGateOrderId;
    }

    public void setPayGateOrderId(String payGateOrderId) {
        this.payGateOrderId = payGateOrderId;
    }

    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //主键的标识属性
    private Integer id;
    
    @Column(name="customerId")
    //短信发送手机号
    private String customerId;
    
    @Column(name="voucherId")
    //短信发送手机号
    private String voucherId;
    
    @Column(name="faceValue")
    //短信发送手机号
    private int faceValue;
    
    public int getCashLimitValue() {
        return cashLimitValue;
    }

    public void setCashLimitValue(int cashLimitValue) {
        this.cashLimitValue = cashLimitValue;
    }

    @Column(name="cashLimitValue")
    //短信发送手机号
    private int cashLimitValue;
    
    @Column(name="getTime")
    //短信发送手机号
    private String getTime;
    
    @Column(name="validTerm")
    //短信发送手机号
    private int validTerm;
    
    @Column(name="voucherStatus")
    //短信发送手机号
    private int voucherStatus;
    
    @Column(name="cashTime")
    //短信发送手机号
    private String cashTime;
    
    @Column(name="cashMobile")
    //短信发送手机号
    private String cashMobile;
    
    @Column(name="payGateOrderId")
    //短信发送手机号
    private String payGateOrderId;
    
    @Column(name="customerOrderId")
    //短信发送手机号
    private String customerOrderId;
    
    
}

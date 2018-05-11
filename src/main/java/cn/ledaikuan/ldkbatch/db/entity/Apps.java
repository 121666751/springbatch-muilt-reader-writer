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
@Table(name="loans_apps")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Apps implements Serializable{

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Contact主键的标识属性
    private Integer id;
    
    @Column(name="customerId", nullable=false, length=20)
    //麦广客户ID
    private String customerId;
    
    @Column(name="appName")
    //应用程序名称
    private String appName;
    
    @Column(name="appPackage")
    //应用程序包名
    private String appPackage;
    
    @Column(name="appVersion")
    //应用程序版本
    private String appVersion;
}

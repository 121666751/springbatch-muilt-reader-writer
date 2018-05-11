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
@Table(name="loans_calllogs_20171123")
@DynamicUpdate(true)
@DynamicInsert(true)
public class CallLog20171123 implements Serializable{

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Contact主键的标识属性
    private Integer id;
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Column(name="name")
    //姓名
    private String name;
    
    @Column(name="number")
    //电话号码
    private String number;
    
    @Column(name="date")
    //通话日期
    private String date;
    
    @Column(name="call_type")
    //通话记录类型
    private int type;
    
    @Column(name="customerId", nullable=false, length=20 , unique=true)
    //麦广客户ID
    private String customerId;
    
}

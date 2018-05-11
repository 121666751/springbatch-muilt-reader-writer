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
@Table(name="loans_contacts_20180119")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Contact20180119 implements Serializable {

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


    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Contact主键的标识属性
    private Integer id;
    
    @Column(name="name")
    //姓名
    private String name;
    
    @Column(name="number")
    //电话号码
    private String number;
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Column(name="customerId", nullable=false, length=20 , unique=true)
    //麦广客户ID
    private String customerId;
    
}

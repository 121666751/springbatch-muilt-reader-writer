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

//@Entity
//@Table(name="job_test")
//@DynamicUpdate(true)
//@DynamicInsert(true)
public class JobTest  implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 20171120L;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //主键的标识属性
    private Integer id;
    
    @Column(name="user_name")
    //短信发送手机号
    private String userName;
    
    @Column(name="password")
    //短信发送手机号
    private String password;
    
    @Column(name="job_time")
    //短信发送手机号
    private String jobTime;
    
    @Column(name="user_status")
    //短信发送手机号
    private int userStatus;
}

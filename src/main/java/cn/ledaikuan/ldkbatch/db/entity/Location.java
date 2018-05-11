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
@Table(name="loans_location")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Location implements Serializable{

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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getGeoCity() {
        return geoCity;
    }

    public void setGeoCity(String geoCity) {
        this.geoCity = geoCity;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Id @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Contact主键的标识属性
    private Integer id;
    
    @Column(name="longitude")
    //经度（电子授权）
    private String longitude;
    
    @Column(name="latitude")
    //纬度（电子授权）
    private String latitude;
    
    @Column(name="geoCity")
    //定位城市（电子授权）
    private String geoCity;
    
    @Column(name="addr")
    //定位具体地点
    private String addr;
    
    @Column(name="time")
    //定位时间
    private String time;
    
    @Column(name="customerId", nullable=false, length=20 , unique=true)
    //麦广客户ID
    private String customerId;
    
}

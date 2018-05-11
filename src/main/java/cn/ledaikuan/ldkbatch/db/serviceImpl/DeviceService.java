package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.DeviceInfoDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.DeviceInfo;

@Service
public class DeviceService {

    //注入DeviceInfoDaoImpl
    @Autowired
    private DeviceInfoDaoImpl deviceInfoDaoImpl;
    
    
    public List<DeviceInfo> findAllDeviceInfoByCustomerId(String customerId){
        if(customerId == null) return null;
        return deviceInfoDaoImpl.findAllByCostomerId(DeviceInfo.class, customerId);
    }
    

}

package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.AppsDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Apps;

@Service
public class AppsService {

    //注入AppsDaoImpl
    @Autowired
    private AppsDaoImpl appsDaoImpl;
    
    public void saveApps(Apps apps ){
        appsDaoImpl.save(apps);
    }
    
    public List<Apps> findAllByCostomerId(String customerId){
        return appsDaoImpl.findAllByCostomerId(Apps.class, customerId);
    }

}

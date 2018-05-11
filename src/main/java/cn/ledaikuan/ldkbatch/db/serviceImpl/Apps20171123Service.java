package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.Apps20171123DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Apps20171123;

@Service
public class Apps20171123Service {

    //注入AppsDaoImpl
    @Autowired
    private Apps20171123DaoImpl apps20171123DaoImpl;
    
    public void saveApps(Apps20171123 apps ){
        apps20171123DaoImpl.save(apps);
    }
    
    public List<Apps20171123> findAllByCostomerId(String customerId){
        return apps20171123DaoImpl.findAllByCostomerId(Apps20171123.class, customerId);
    }

}

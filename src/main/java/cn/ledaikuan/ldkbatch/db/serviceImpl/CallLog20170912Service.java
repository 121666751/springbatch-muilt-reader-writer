package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CallLog20170912DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20170912;


@Service
public class CallLog20170912Service {

    //注入ContactDaoImpl
    @Autowired
    private CallLog20170912DaoImpl callLog20170912DaoImpl;
    

    
    public List<CallLog20170912> findAllCallLog20170912ByCustomerId(String customerId){
        if(customerId == null)return null;
        return callLog20170912DaoImpl.findAllByCostomerId(CallLog20170912.class, customerId);
    }

}

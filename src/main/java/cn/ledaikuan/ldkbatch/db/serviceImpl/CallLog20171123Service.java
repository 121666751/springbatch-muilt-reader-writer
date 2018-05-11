package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CallLog20171123DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20171123;


@Service
public class CallLog20171123Service {

    //注入ContactDaoImpl
    @Autowired
    private CallLog20171123DaoImpl callLog20171123DaoImpl;

    public List<CallLog20171123> findAllCallLog20171123ByCustomerId(String customerId){
        if(customerId == null)return null;
        return callLog20171123DaoImpl.findAllByCostomerId(CallLog20171123.class, customerId);
    }
    
}

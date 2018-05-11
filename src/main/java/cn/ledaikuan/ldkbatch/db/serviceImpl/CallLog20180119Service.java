package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CallLog20180119DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20180119;


@Service
public class CallLog20180119Service {

    //注入ContactDaoImpl
    @Autowired
    private CallLog20180119DaoImpl callLog20180119DaoImpl;
    

    
    public List<CallLog20180119> findAllCallLog20180119ByCustomerId(String customerId){
        if(customerId == null)return null;
        return callLog20180119DaoImpl.findAllByCostomerId(CallLog20180119.class, customerId);
    }
    
}

package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CallLogDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CallLog;


@Service
public class CallLogService {

    
    //注入ContactDaoImpl
    @Autowired
    private CallLogDaoImpl calllogDaoImpl;
    
    
    public List<CallLog> findAllCallLogByCustomerId(String customerId){
        if(customerId == null)return null;
        return calllogDaoImpl.findAllByCostomerId(CallLog.class, customerId);
    }
    
}

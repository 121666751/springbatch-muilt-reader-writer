package cn.ledaikuan.ldkbatch.db.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.db.daoImpl.CallLog20170912OldDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20170912Old;


@Service
public class CallLog20170912OldService {

    //注入ContactDaoImpl
    @Autowired
    private CallLog20170912OldDaoImpl callLog20170912OldDaoImpl;
    
    public long findCountByCustomerId(String customerId){
        if(StringUtils.isEmpty(customerId))return 0;
        return callLog20170912OldDaoImpl.findCountByCustomerId(customerId);
    }
    
    public List<CallLog20170912Old> findAllyByCustomerId(String customerId){
        return callLog20170912OldDaoImpl.findAllByCostomerId(CallLog20170912Old.class, customerId);
    }
    
}

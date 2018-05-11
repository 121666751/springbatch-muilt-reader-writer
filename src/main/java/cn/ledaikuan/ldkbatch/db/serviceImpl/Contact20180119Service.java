package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.Contact20180119DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Contact20180119;


@Service
public class Contact20180119Service {

    @Autowired
    private Contact20180119DaoImpl contact20180119DaoImpl;
    
    public List<Contact20180119> findAllContact20180119ByCustomerId(String customerId){
        return contact20180119DaoImpl.findAllByCostomerId(Contact20180119.class, customerId);
    }
    
}

package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.Contact20171123DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Contact20171123;

@Service
public class Contact20171123Service {

    @Autowired
    private Contact20171123DaoImpl contact20171123DaoImpl;
    
    public List<Contact20171123> findAllContact20171123ByCustomerId(String customerId){
        return contact20171123DaoImpl.findAllByCostomerId(Contact20171123.class, customerId);
    }
    
    
}

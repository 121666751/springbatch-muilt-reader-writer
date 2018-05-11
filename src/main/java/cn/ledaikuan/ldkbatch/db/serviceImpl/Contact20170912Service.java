package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.Contact20170912DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Contact20170912;

@Service
public class Contact20170912Service {

    @Autowired
    private Contact20170912DaoImpl contact20170912DaoImpl;
    
    public List<Contact20170912> findAllContact20170912ByCustomerId(String customerId){
        return contact20170912DaoImpl.findAllByCostomerId(Contact20170912.class, customerId);
    }
    
}

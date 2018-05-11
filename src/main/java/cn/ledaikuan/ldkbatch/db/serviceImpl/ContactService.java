package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.ContactDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.Contact;


@Service
public class ContactService {

    //注入ContactDaoImpl
    @Autowired
    private ContactDaoImpl contactDaoImpl;
    
    public List<Contact> findAllContactByCustomerId(String customerId){
        return contactDaoImpl.findAllByCostomerId(Contact.class, customerId);
    }
    
}

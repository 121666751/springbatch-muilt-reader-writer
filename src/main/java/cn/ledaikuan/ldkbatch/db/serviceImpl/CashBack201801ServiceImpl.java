package cn.ledaikuan.ldkbatch.db.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CashBack201801DaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CashBack201801;

@Service
public class CashBack201801ServiceImpl {

    @Autowired
    private CashBack201801DaoImpl cashBack201801DaoImpl;
    
    public CashBack201801 findCashBackByCustomerId(String customerId){
        return cashBack201801DaoImpl.findCashBackByCustomerId(customerId);
    }
    
    public void saveOrUpdateCashBack(CashBack201801 cashback){
        cashBack201801DaoImpl.saveOrUpdate(cashback);
    }
    
    public String findPushDeviceIdByCustomerId(String customerId){
        return cashBack201801DaoImpl.findPushDeviceIdByCustomerId(customerId);
    }
}

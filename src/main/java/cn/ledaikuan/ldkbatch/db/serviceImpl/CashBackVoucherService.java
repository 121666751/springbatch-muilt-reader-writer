package cn.ledaikuan.ldkbatch.db.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ledaikuan.ldkbatch.db.daoImpl.CashBackVoucherDaoImpl;
import cn.ledaikuan.ldkbatch.db.entity.CashBackVoucher;

@Service
public class CashBackVoucherService {

    @Autowired
    private CashBackVoucherDaoImpl cashBackVoucherDaoImpl;
    
    public List<CashBackVoucher> listCashBackVoucherByCustomerId(String customerId){
        return cashBackVoucherDaoImpl.listCashBackVoucherByCustomerId(customerId);
    }
    
    public void save4CashBackVoucher(String addTime,String customerId){
        List<CashBackVoucher> list = listCashBackVoucherByCustomerId(customerId);
        if(list ==null || list.size()<1){
            CashBackVoucher cashbackVoucher1 = getCashBackVoucher(customerId,50,addTime,7,"201801",1);
            cashBackVoucherDaoImpl.save(cashbackVoucher1);
            CashBackVoucher cashbackVoucher2 = getCashBackVoucher(customerId,100,addTime,45,"201801",2);
            cashBackVoucherDaoImpl.save(cashbackVoucher2);
            CashBackVoucher cashbackVoucher3 = getCashBackVoucher(customerId,200,addTime,45,"201801",3);
            cashBackVoucherDaoImpl.save(cashbackVoucher3);
            CashBackVoucher cashbackVoucher4 = getCashBackVoucher(customerId,300,addTime,45,"201801",4);
            cashBackVoucherDaoImpl.save(cashbackVoucher4);
        }
    }
    
    private CashBackVoucher getCashBackVoucher(String customerId,int faceValue,String getTime,int validTerm,String batch,int id){
        CashBackVoucher cashbackVoucher = new CashBackVoucher();
        cashbackVoucher.setCustomerId(customerId);
        cashbackVoucher.setFaceValue(faceValue);
        cashbackVoucher.setGetTime(getTime);
        cashbackVoucher.setValidTerm(validTerm);
        if(faceValue == 50){
            cashbackVoucher.setCashLimitValue(0);
        }else if(faceValue == 100){
            cashbackVoucher.setCashLimitValue(4000);
        }else if(faceValue == 200){
            cashbackVoucher.setCashLimitValue(8000);
        }else if(faceValue == 300){
            cashbackVoucher.setCashLimitValue(12000);
        }
        cashbackVoucher.setVoucherId(customerId+"_"+batch+"_"+id);
        return cashbackVoucher;
    }
}

package cn.ledaikuan.ldkbatch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ledaikuan.ldkbatch.db.entity.CashBack201801;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CashBack201801ServiceImpl;
import cn.ledaikuan.ldkbatch.db.serviceImpl.CashBackVoucherService;
import cn.ledaikuan.ldkbatch.model.CashBackUserClassify;

public class CashBackItemWriter implements ItemWriter<CashBackUserClassify>{

    @Autowired
    private CashBack201801ServiceImpl cashBack201801ServiceImpl;
    
    @Autowired
    private CashBackVoucherService cashBackVoucherService;
    
    @Override
    public void write(List<? extends CashBackUserClassify> items) throws Exception {
        System.out.println("do nothing size = "+(items==null?0:items.size()));
        if(items == null || items.size()<1)return;
        for(CashBackUserClassify classify : items){
            System.out.println("customerId ="+classify.getCustomerId()+"userType = "+classify.getUserType());
            
            CashBack201801 cashback201801 = cashBack201801ServiceImpl.findCashBackByCustomerId(classify.getCustomerId());
            if(cashback201801 == null){
                cashback201801 = new CashBack201801();
                cashback201801.setCustomerId(classify.getCustomerId());
                cashback201801.setMobileNo(classify.getMobileNo());
                cashback201801.setPushDeviceId(cashBack201801ServiceImpl.findPushDeviceIdByCustomerId(classify.getCustomerId()));
                cashback201801.setPushType(classify.getPushType());
                cashback201801.setUserType(classify.getUserType());
                
                cashBack201801ServiceImpl.saveOrUpdateCashBack(cashback201801);
            }
            
            cashBackVoucherService.save4CashBackVoucher("2018-01-19 10:18:18", classify.getCustomerId());
        }
    }

}

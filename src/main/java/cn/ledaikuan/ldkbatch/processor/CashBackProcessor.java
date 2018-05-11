package cn.ledaikuan.ldkbatch.processor;

import org.springframework.batch.item.ItemProcessor;

import cn.ledaikuan.ldkbatch.model.CashBackUserClassify;
import cn.ledaikuan.ldkbatch.model.CashBackUserField;

public class CashBackProcessor  implements ItemProcessor<CashBackUserField,CashBackUserClassify>{

    @Override
    public CashBackUserClassify process(CashBackUserField item) throws Exception {
        System.out.println("Process");
        CashBackUserClassify classify = new CashBackUserClassify();
        classify.setCustomerId(item.getCustomerId());
        classify.setMobileNo(item.getMobileNo());
        String userType = "D";
        if(item.getNextPayDate() == null){
            userType ="B";
        }else if(item.getTotalLoanAmt() == 0){
            userType = "A";
        }else if(item.getTotalLoanAmt() > 0){
            userType = "C";
        }
        classify.setUserType(userType);
        int num = (int)(Math.random()*3)+1 ;
        classify.setPushType(num==1?1:2);
        return classify;
    }

}

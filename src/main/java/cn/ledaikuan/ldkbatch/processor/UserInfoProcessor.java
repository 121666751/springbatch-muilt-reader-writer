package cn.ledaikuan.ldkbatch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.idno.IdcardInfoExtractor;
import cn.ledaikuan.ldkbatch.model.UserInfoBean;
import cn.ledaikuan.ldkbatch.model.UserInfoField;

public class UserInfoProcessor implements ItemProcessor<UserInfoField,UserInfoBean> {

    @Override
    public UserInfoBean process(UserInfoField item) throws Exception {
        UserInfoBean bean = new UserInfoBean();
        if(!StringUtils.isEmpty(item.getRegisterTime())){
            bean.setRegisterTime(item.getRegisterTime());
        }
        if(!StringUtils.isEmpty(item.getMobileNo())){
            bean.setMobileNo(item.getMobileNo());
        }
        if(!StringUtils.isEmpty(item.getChannel())){
            bean.setChannel(item.getChannel());
        }
        if(!StringUtils.isEmpty(item.getResultStatus())){
            bean.setResultStatus(item.getResultStatus());
        }
        if(!StringUtils.isEmpty(item.getIdNo())){
            String idNo = item.getIdNo();
            bean.setIdNo(idNo);
            
            IdcardInfoExtractor idcardInfo=new IdcardInfoExtractor(idNo);  
            //System.out.println("出生日期:"+idcardInfo.getYear()+"-"+idcardInfo.getMonth()+"-"+idcardInfo.getDay());
            bean.setBirthday(idcardInfo.getYear()+"-"+idcardInfo.getMonth()+"-"+idcardInfo.getDay());
            //System.out.println("性别:"+idcardInfo.getGender());
            bean.setGender(idcardInfo.getGender());
            //System.out.println("年龄:"+idcardInfo.getAge());
            bean.setAge(idcardInfo.getAge());
            //System.out.println("省份:"+idcardInfo.getProvince());
        }
        if(!StringUtils.isEmpty(item.getCustomerName())){
            bean.setCustomerName(item.getCustomerName());
        }
        if(!StringUtils.isEmpty(item.getIdApplyStatus())){
            bean.setIdApplyStatus(item.getIdApplyStatus());
        }
        if(!StringUtils.isEmpty(item.getDebitCardNo())){
            bean.setDebitCardNo(item.getDebitCardNo());
        }
        if(!StringUtils.isEmpty(item.getOpenBank())){
            bean.setOpenBank(item.getOpenBank());
        }
        if(!StringUtils.isEmpty(item.getDebitCardPhoneNo())){
            bean.setDebitCardPhoneNo(item.getDebitCardPhoneNo());
        }
        if(!StringUtils.isEmpty(item.getProv())){
            bean.setProv(item.getProv());
        }
        if(!StringUtils.isEmpty(item.getCity())){
            bean.setCity(item.getCity());
        }
        if(!StringUtils.isEmpty(item.getHomeAddr1())){
            bean.setHomeAddr(item.getHomeAddr1()+"_"+item.getHomeAddr2()+"_"+item.getHomeAddr3()+"_"+item.getHomeAddr4());
        }
        if(!StringUtils.isEmpty(item.getJobUnit())){
            bean.setJobUnit(item.getJobUnit());
        }
        if(!StringUtils.isEmpty(item.getUnitAddr1())){
            bean.setUnitAddr(item.getUnitAddr1()+"_"+item.getUnitAddr2()+"_"+item.getUnitAddr3()+"_"+item.getUnitAddr4());
        }

        return bean;
    }

}

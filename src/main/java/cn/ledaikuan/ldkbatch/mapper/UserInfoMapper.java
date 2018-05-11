package cn.ledaikuan.ldkbatch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.model.UserInfoField;

public class UserInfoMapper implements RowMapper<UserInfoField>{

    @Override
    public UserInfoField mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserInfoField field = new UserInfoField();
        String registerTime = rs.getString("registerTime");
        if(!StringUtils.isEmpty(registerTime)){
            field.setRegisterTime(registerTime);
        }
        String mobileNo = rs.getString("mobileNo");
        if(!StringUtils.isEmpty(mobileNo)){
            field.setMobileNo(mobileNo);
        }
        String resultStatus = rs.getString("resultStatus");
        if(!StringUtils.isEmpty(resultStatus)){
            field.setResultStatus(resultStatus);
        }
        String channel = rs.getString("channel");
        if(!StringUtils.isEmpty(channel)){
            field.setChannel(channel);
        }
        String idNo = rs.getString("idNo");
        if(!StringUtils.isEmpty(idNo)){
            field.setIdNo(idNo);
        }
        String customerName = rs.getString("customerName");
        if(!StringUtils.isEmpty(customerName)){
            field.setCustomerName(customerName);
        }
        String idApplyStatus = rs.getString("idApplyStatus");
        if(!StringUtils.isEmpty(idApplyStatus)){
            field.setIdApplyStatus(idApplyStatus);
        }
        String debitCardNo = rs.getString("debitCardNo");
        if(!StringUtils.isEmpty(debitCardNo)){
            field.setDebitCardNo(debitCardNo);
        }
        String openBank = rs.getString("openBank");
        if(!StringUtils.isEmpty(openBank)){
            field.setOpenBank(openBank);
        }
        String debitCardPhoneNo = rs.getString("debitCardPhoneNo");
        if(!StringUtils.isEmpty(debitCardPhoneNo)){
            field.setDebitCardPhoneNo(debitCardPhoneNo);
        }
        String prov = rs.getString("prov");
        if(!StringUtils.isEmpty(prov)){
            field.setProv(prov);
        }
        String city = rs.getString("city");
        if(!StringUtils.isEmpty(city)){
            field.setCity(city);
        }
        String homeAddr1 = rs.getString("homeAddr1");
        if(!StringUtils.isEmpty(homeAddr1)){
            field.setHomeAddr1(homeAddr1);
        }
        String homeAddr2 = rs.getString("homeAddr2");
        if(!StringUtils.isEmpty(homeAddr2)){
            field.setHomeAddr2(homeAddr2);
        }
        String homeAddr3 = rs.getString("homeAddr3");
        if(!StringUtils.isEmpty(homeAddr3)){
            field.setHomeAddr3(homeAddr3);
        }
        String homeAddr4 = rs.getString("homeAddr4");
        if(!StringUtils.isEmpty(homeAddr4)){
            field.setHomeAddr4(homeAddr4);
        }
        String jobUnit = rs.getString("jobUnit");
        if(!StringUtils.isEmpty(jobUnit)){
            field.setJobUnit(jobUnit);
        }
        String unitAddr1 = rs.getString("unitAddr1");
        if(!StringUtils.isEmpty(unitAddr1)){
            field.setUnitAddr1(unitAddr1);
        }
        String unitAddr2 = rs.getString("unitAddr2");
        if(!StringUtils.isEmpty(unitAddr2)){
            field.setUnitAddr2(unitAddr2);
        }
        String unitAddr3 = rs.getString("unitAddr3");
        if(!StringUtils.isEmpty(unitAddr3)){
            field.setUnitAddr3(unitAddr3);
        }
        String unitAddr4 = rs.getString("unitAddr4");
        if(!StringUtils.isEmpty(unitAddr4)){
            field.setUnitAddr4(unitAddr4);
        }
        return field;
    }

}

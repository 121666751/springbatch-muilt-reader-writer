package cn.ledaikuan.ldkbatch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.ledaikuan.ldkbatch.model.CashBackUserField;

public class CashBackUserMapper  implements RowMapper<CashBackUserField>{

    @Override
    public CashBackUserField mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        CashBackUserField field = new CashBackUserField();
        String customerId = rs.getString("customerId");
        if(customerId!=null){
            field.setCustomerId(customerId);
        }
        String mobileNo = rs.getString("mobileNo");
        if(mobileNo!=null){
            field.setMobileNo(mobileNo);
        }
        field.setTotalLoanAmt(rs.getLong("totalLoanAmt"));
        String nextPayDate = rs.getString("nextPayDate");
        if(nextPayDate!=null){
            field.setNextPayDate(nextPayDate);
        }
        field.setBaseTotCreLine(rs.getLong("baseTotCreLine"));
        field.setBaseRestCreLine(rs.getLong("baseRestCreLine"));
        System.out.println("mapper rowNum = "+rowNum+" customerId = "+customerId+" mobileNo = "+mobileNo+" nextPayDate = "+nextPayDate+" totalLoanAmt = "+field.getTotalLoanAmt());
        return field;
    }

}

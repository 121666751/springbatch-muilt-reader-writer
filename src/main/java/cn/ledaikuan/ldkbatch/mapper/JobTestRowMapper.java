package cn.ledaikuan.ldkbatch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import cn.ledaikuan.ldkbatch.model.JobTestBean;

public class JobTestRowMapper implements RowMapper<JobTestBean>{

    @Override
    public JobTestBean mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("mapper rowNum = "+rowNum);
        JobTestBean bean = new JobTestBean();
        bean.setId(rs.getInt("id"));
        bean.setJob_time(rs.getString("job_time"));
        bean.setPassword(rs.getString("password"));
        bean.setUser_name(rs.getString("user_name"));
        bean.setUser_status(rs.getInt("user_status"));
        return bean;
    }

}

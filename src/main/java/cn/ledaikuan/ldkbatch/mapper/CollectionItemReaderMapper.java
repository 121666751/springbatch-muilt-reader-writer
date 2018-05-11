package cn.ledaikuan.ldkbatch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.model.CollectionItemReaderModel;

public class CollectionItemReaderMapper  implements RowMapper<CollectionItemReaderModel>{

    @Override
    public CollectionItemReaderModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        CollectionItemReaderModel model = new CollectionItemReaderModel();
        String customerId = rs.getString("customerId");
        if(!StringUtils.isEmpty(customerId)){
            model.setCustomerId(customerId);
        }
        String applicationId = rs.getString("applicationId");
        if(!StringUtils.isEmpty(applicationId)){
            model.setApplicationId(applicationId);
        }
        return model;
    }

}

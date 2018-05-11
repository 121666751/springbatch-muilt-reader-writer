package cn.ledaikuan.ldkbatch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import cn.ledaikuan.ldkbatch.model.UserInfoBean;

public class UserInfoItemWriter implements ItemWriter<UserInfoBean>{

    protected static Logger logger = LoggerFactory.getLogger(UserInfoItemWriter.class);
    
    @Override
    public void write(List<? extends UserInfoBean> items) throws Exception {
        logger.debug("do nothing size = "+(items==null?0:items.size()));
        if(items == null || items.size()<1)return;
        for(UserInfoBean bean :items){
            logger.debug(bean.toString());
        }
    }

}

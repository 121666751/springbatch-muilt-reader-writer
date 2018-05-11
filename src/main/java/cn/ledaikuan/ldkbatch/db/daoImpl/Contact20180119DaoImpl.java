package cn.ledaikuan.ldkbatch.db.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.db.common.BaseDaoHibernate5;
import cn.ledaikuan.ldkbatch.db.entity.Contact20180119;

//注入
@Repository
public class Contact20180119DaoImpl extends BaseDaoHibernate5<Contact20180119>{

    @SuppressWarnings("deprecation")
    public long findCountByCustomerId(String customerId){
        if(StringUtils.isEmpty(customerId))return -1;
        return (long)sessionFactory.getCurrentSession()
                .createQuery("select count(*) from Contact20180119 en where en.customerId = ?0")
                .setParameter(0, customerId)
                .uniqueResult();
    }
    
}

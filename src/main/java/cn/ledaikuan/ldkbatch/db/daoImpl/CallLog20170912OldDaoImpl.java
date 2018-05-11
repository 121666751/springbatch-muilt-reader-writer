package cn.ledaikuan.ldkbatch.db.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import cn.ledaikuan.ldkbatch.db.common.BaseDaoHibernate5;
import cn.ledaikuan.ldkbatch.db.entity.CallLog20170912Old;

//注入
@Repository
public class CallLog20170912OldDaoImpl extends BaseDaoHibernate5<CallLog20170912Old>{

    @SuppressWarnings("deprecation")
    public long findCountByCustomerId(String customerId){
        if(StringUtils.isEmpty(customerId))return -1;
        return (long)sessionFactory.getCurrentSession()
                .createQuery("select count(*) from CallLog20170912Old en where en.customerId = ?0")
                .setParameter(0, customerId)
                .uniqueResult();
    }
    
}

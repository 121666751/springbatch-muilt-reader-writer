package cn.ledaikuan.ldkbatch.db.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ledaikuan.ldkbatch.db.common.BaseDaoHibernate5;
import cn.ledaikuan.ldkbatch.db.dao.CashBack201801Dao;
import cn.ledaikuan.ldkbatch.db.entity.CashBack201801;

@Repository
public class CashBack201801DaoImpl  extends BaseDaoHibernate5<CashBack201801> implements CashBack201801Dao{

    @SuppressWarnings("unchecked")
    public CashBack201801 findCashBackByCustomerId(String customerId){
        List<CashBack201801> list = sessionFactory.getCurrentSession()
                .createQuery("select en from CashBack201801 en where en.customerId = ?0")
                .setParameter(0, customerId)
                .setMaxResults(1)
                .getResultList();
        if(list==null || list.size()<1)return null;
        return  list.get(0);
    }
    
    @SuppressWarnings("unchecked")
    public String findPushDeviceIdByCustomerId(String customerId){
         List<String> list = sessionFactory.getCurrentSession()
                 .createNativeQuery("select pushDeviceId from loans_logininfo where customerId = ?0")
                 .setParameter(0, customerId)
                 .setMaxResults(1)
                 .getResultList();
         if(list==null || list.size()<1)return null;
         return list.get(0);
     }
}

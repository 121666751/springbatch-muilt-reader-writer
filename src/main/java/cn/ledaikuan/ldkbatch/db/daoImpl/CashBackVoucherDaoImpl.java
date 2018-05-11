package cn.ledaikuan.ldkbatch.db.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ledaikuan.ldkbatch.db.common.BaseDaoHibernate5;
import cn.ledaikuan.ldkbatch.db.dao.CashBackVoucherDao;
import cn.ledaikuan.ldkbatch.db.entity.CashBackVoucher;

@Repository
public class CashBackVoucherDaoImpl extends BaseDaoHibernate5<CashBackVoucher> implements CashBackVoucherDao{

    @SuppressWarnings("unchecked")
    public List<CashBackVoucher> listCashBackVoucherByCustomerId(String customerId){
        return sessionFactory.getCurrentSession()
                .createQuery("select en from CashBackVoucher en where en.customerId = ?0")
                .setParameter(0, customerId)
                .getResultList();
    }
    
}

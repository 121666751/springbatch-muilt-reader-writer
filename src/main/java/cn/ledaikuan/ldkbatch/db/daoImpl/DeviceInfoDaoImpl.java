package cn.ledaikuan.ldkbatch.db.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ledaikuan.ldkbatch.db.common.BaseDaoHibernate5;
import cn.ledaikuan.ldkbatch.db.entity.DeviceInfo;

//注入
@Repository
public class DeviceInfoDaoImpl  extends BaseDaoHibernate5<DeviceInfo> {

    @SuppressWarnings("unchecked")
    public List<DeviceInfo> findAllDeviceInfoByCustomerIdOrderbyId(String customerId){
        return sessionFactory.getCurrentSession()
        .createQuery("select en from DeviceInfo en where en.customerId = ?0 order by id desc")
        .setParameter(0, customerId)
        .getResultList();
    }
    
}

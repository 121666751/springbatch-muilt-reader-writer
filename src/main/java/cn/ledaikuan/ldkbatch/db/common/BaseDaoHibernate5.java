package cn.ledaikuan.ldkbatch.db.common;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class BaseDaoHibernate5<T> implements BaseDao<T>{

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;
    
    @Override
    public T get(Class<T> entityClazz, Serializable id) {
        // TODO Auto-generated method stub
        return (T)sessionFactory.getCurrentSession().get(entityClazz, id);
    }

    @Override
    public Serializable save(T enetity) {
        // TODO Auto-generated method stub
        return sessionFactory.getCurrentSession().save(enetity);
    }

    @Override
    public void update(T entity) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public void delete(Class<T> entityClazz, Serializable id) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().createQuery("delete "+entityClazz.getSimpleName()
        +" en where en.id = ?0")
        .setParameter(0, id)
        .executeUpdate();
    }

    @Override
    public List<T> findAll(Class<T> entityClazz) {
        // TODO Auto-generated method stub
        return find("select en from "+ entityClazz.getSimpleName()+" en");
    }

    @Override
    public long findCount(Class<T> entityClazz) {
        // TODO Auto-generated method stub
        return  (long) sessionFactory.getCurrentSession()
                .createQuery("select count(*) from "+ entityClazz.getSimpleName())
                .getSingleResult();
    }

    @Override
    public void saveOrUpdate(Object entity) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().saveOrUpdate(entity);
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql){
        return (List<T>)sessionFactory.getCurrentSession()
                .createQuery(hql)
                .getResultList();
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected List<T> find(String hql , Object... params){
        Query query = sessionFactory.getCurrentSession()
                .createQuery(hql);
        for(int i=0 , len = params.length; i < len ; i++){
            query.setParameter(i + "", params[i]);
        }
        return (List<T>)query.getResultList();
    }
    
    @SuppressWarnings("unchecked")
    public List<T> findAllByCostomerId(Class<T> entityClazz , String customerId) {
        return sessionFactory.getCurrentSession()
                .createQuery("select en from "+ entityClazz.getSimpleName()+" en where en.customerId = ?0")
                .setParameter(0, customerId)
                .getResultList();
    }
    
}

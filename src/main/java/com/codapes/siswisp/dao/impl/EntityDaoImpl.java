package com.codapes.siswisp.dao.impl;

import com.codapes.siswisp.dao.EntityDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author Christian
 * @param <T>
 */
//@Repository
public class EntityDaoImpl<T> implements EntityDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public <T> void createT(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.save(entity);
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        } finally {
            session.close();
        }
    }    

    @Override
    public <T> List<T> listT(Class c) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        List<T> list = new ArrayList<>();
        try {
            tx.begin();
                Query query=session.createQuery("select a from "+ c.getName()+" a");
                list=query.list();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public <T> void updateT(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.saveOrUpdate(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public <T> void deleteT(T entity,int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        
        try {
            tx.begin();
            session.load(entity, id);
            session.delete(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        }

    }

    @Override
    public <T> T findById(Class entity, int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        T t=null;
        Object object = new Object();
        try {
            tx.begin();
            t=(T) session.get(entity.getName(), id);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            session.close();
        
        }
        return t;
        
    }
    
    

}

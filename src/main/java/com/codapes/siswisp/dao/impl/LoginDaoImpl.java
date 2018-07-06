package com.codapes.siswisp.dao.impl;

import com.codapes.siswisp.dao.LoginDao;
import com.codapes.siswisp.entity.Admin;
import com.codapes.siswisp.entity.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */
@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private SessionFactory sessionFactory;

//    public void setSessionFactory(SessionFactory sessionFactory){
//        this.sessionFactory=sessionFactory;
//    }
    @Override
    public Users login(String user) {
        //Session session = FactorySession.getSessionFactory().openSession();
        //Transaction tx=session.getTransaction();
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        Users a = new Users();
        try {
            tx.begin();
            Criteria criteria = session.createCriteria(Users.class);
            criteria.add(Restrictions.eq("username", user));

            a = (Users) criteria.uniqueResult();
            tx.commit();

        } catch (Exception e) {
            System.out.println("Mensaje: " + e.getMessage());
            tx.rollback();

        } finally {
            session.close();
        }

        return a;
    }

}

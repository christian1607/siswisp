
package com.codapes.siswisp.dao.impl;

import com.codapes.siswisp.dao.EquipoDao;
import com.codapes.siswisp.entity.Equipo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Christian
 */
@Repository
public class EquipoDaoImpl implements EquipoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Equipo> listarEquipoDisponible() {
        List<Equipo> lista=null;
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            Query query = session.createQuery("from Equipo e where e.usuario = null");
            lista = query.list();
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
        } finally {
            session.close();
        }
        return lista;
    }
}
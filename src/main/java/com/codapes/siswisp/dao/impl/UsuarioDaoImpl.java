
package com.codapes.siswisp.dao.impl;

import com.codapes.siswisp.dao.UsuarioDao;
import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import com.codapes.siswisp.exception.BusinessException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
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
public class UsuarioDaoImpl  implements UsuarioDao{

    private static final Logger LOG=Logger.getLogger(UsuarioDaoImpl.class);
    
    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public void create(Usuario usuario,Cuentausuario cuentausuario,Equipo equipo)  throws BusinessException{
        Session session = sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        
        try {
            tx.begin();
            session.save(usuario);
            cuentausuario.setUsuario(usuario);
            equipo.setUsuario(usuario);
            session.save(cuentausuario);
            session.update(equipo);
            tx.commit();
           
        } catch (HibernateException e) {
            LOG.error("ERROR", e);
            tx.rollback();
            throw new BusinessException("GRAVE","Se produjo un error al guardar datos");
        }
        finally{
            session.close();
        }
        
    }

    @Override
    public List<Usuario> list() {
        Session session = sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        List<Usuario> list=new ArrayList<>();
        try {
            tx.begin();
            Criteria criteria= session.createCriteria(Usuario.class);
            list=criteria.list();
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
        }
        finally{
            session.close();
        }
        return list;
    }

    @Override
    public void update(Usuario usuario) {
        Session session = sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        
        try {
            tx.begin();
            session.saveOrUpdate(usuario);
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
        }
        finally{
            session.close();
        }
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx=session.getTransaction();
        Usuario usuario;
        try {
            tx.begin();
            usuario=(Usuario)session.load(Usuario.class, id);
            session.delete(usuario);
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
        }
        finally{
            session.close();
        }
        
    }
    
    
}

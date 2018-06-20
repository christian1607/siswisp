
package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.UsuarioDao;
import com.codapes.siswisp.dao.impl.EntityDaoImpl;
import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import com.codapes.siswisp.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class UsuarioServiceImpl extends EntityDaoImpl<Usuario> implements UsuarioService {
    
    @Autowired
    private UsuarioDao usuarioDao;
    
  
    
    @Override
    public void create(Usuario usuario,Cuentausuario cuentausuario,Equipo equipo) {
        try {
            usuarioDao.create(usuario, cuentausuario, equipo);
           
        } catch (Exception e) {
            System.out.println("ERROR SERVICES");
            
        }
 
    }

    @Override
    public List<Usuario> list() {
        
        return listT(Usuario.class);
        
    }

    @Override
    public Usuario findById(int id) {
        
     return findById(Usuario.class, id);
    }

    @Override
    public void delete(int id) {
        Usuario usuario= new Usuario();
        deleteT(usuario, id);
    }

    @Override
    public void update(Usuario usuario) {
        updateT(usuario);
    }
    
    
    
    
    
}

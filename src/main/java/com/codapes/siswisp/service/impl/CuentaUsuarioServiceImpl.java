
package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.impl.EntityDaoImpl;
import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.service.CuentaUsuarioService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class CuentaUsuarioServiceImpl extends EntityDaoImpl<Cuentausuario> implements CuentaUsuarioService {

    @Override
    public List<Cuentausuario> list() {
       return listT(Cuentausuario.class); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cuentausuario cuentausuario) {
        updateT(cuentausuario);
    }

    @Override
    public void delete(int id) {
        Cuentausuario cuentausuario = new Cuentausuario();
        deleteT(cuentausuario, id);
    }

    @Override
    public Cuentausuario findById(int id) {
       return  findById(Cuentausuario.class, id); //To change body of generated methods, choose Tools | Templates.
    }
    
}

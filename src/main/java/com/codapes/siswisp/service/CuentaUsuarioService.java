
package com.codapes.siswisp.service;

import com.codapes.siswisp.entity.Cuentausuario;

import java.util.List;

/**
 *
 * @author Christian
 */
public interface CuentaUsuarioService {
    
       
    public List<Cuentausuario> list();
    public void update(Cuentausuario cuentausuario);
    public void delete(int id);
    public Cuentausuario findById(int id);
    
}

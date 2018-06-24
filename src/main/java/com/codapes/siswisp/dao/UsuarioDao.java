
package com.codapes.siswisp.dao;

import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import com.codapes.siswisp.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface UsuarioDao {
    
    public void create(Usuario usuario,Cuentausuario cuentausuario,Equipo equipo)  throws BusinessException;
    public List<Usuario> list();
    public void update (Usuario usuario);
    public void delete (int id);
    
}

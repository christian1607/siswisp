
package com.codapes.siswisp.dao;

import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface UsuarioDao {
    
    public void create(Usuario usuario,Cuentausuario cuentausuario,Equipo equipo);
    public List<Usuario> list();
    public void update (Usuario usuario);
    public void delete (int id);
    
}

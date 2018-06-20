
package com.codapes.siswisp.service;

import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface UsuarioService {
    
    public static List<Usuario> bd = new ArrayList<>();
    
    public void create(Usuario usuario,Cuentausuario cuentausuario,Equipo equipo);
    
    public List<Usuario> list();
    
    public Usuario findById(int id);
    
    public void delete(int id);
    
    public void update(Usuario usuario);
    
}

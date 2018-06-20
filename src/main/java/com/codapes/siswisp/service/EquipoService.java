
package com.codapes.siswisp.service;

import com.codapes.siswisp.entity.Equipo;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface EquipoService {
 
    public void create(Equipo equipo);
    public List<Equipo> list();
    public void update(Equipo equipo);
    public void delete(int id);
    public Equipo findById(int id);
    public List<Equipo> listarEquiposDisponibles();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.EquipoDao;
import com.codapes.siswisp.dao.impl.EntityDaoImpl;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.service.EquipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */

@Service
public class EquipoServiceImpl extends EntityDaoImpl implements EquipoService{

    @Autowired
    private EquipoDao equipoDao;
    
    @Override
    public void create(Equipo equipo) {
        createT(equipo);
    }

    @Override
    public List<Equipo> list() {
       
       return listT(Equipo.class);
    }

    @Override
    public void update(Equipo equipo) {
        updateT(equipo);
    }

    @Override
    public void delete(int id) {
        Equipo equipo = new Equipo();
        deleteT(equipo,id);
    }

    @Override
    public Equipo findById(int id) {
        Equipo equipo;
        equipo=(Equipo)findById(Equipo.class, id);
        
        return equipo;
    }

    @Override
    public List<Equipo> listarEquiposDisponibles() {
        return equipoDao.listarEquipoDisponible();
    }
    
    
    
    
}

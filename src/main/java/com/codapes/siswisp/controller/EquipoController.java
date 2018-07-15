package com.codapes.siswisp.controller ;

import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.service.EquipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Christian
 */
@Controller
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    EquipoService equipoService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView goEquipos() {

        ModelAndView mav = new ModelAndView();
        List<Equipo> lista = equipoService.list();
        mav.addObject("lista", lista);
        mav.setViewName("equipo");

        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView goEquipoCreate() {

        ModelAndView mav = new ModelAndView();
        Equipo equipo = new Equipo();
        mav.addObject("equipo", equipo);
        mav.setViewName("equipoCreate");
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createEquipo(@ModelAttribute Equipo equipo) {

        ModelAndView mav = new ModelAndView();
        try {
            equipoService.create(equipo);
            mav.setViewName("equipo");

            mav.addObject("msg", "Se registro correctamente el equipo");
            mav.addObject("tipoMensaje", "success");
            List<Equipo> lista = equipoService.list();
            mav.addObject("lista", lista);

        } catch (Exception e) {
            mav.addObject("msg", "Error al registrar: " + e.getMessage());
            mav.addObject("tipoMensaje", "danger");
            mav.setViewName("equipoCreate");
        }

        return mav;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView goEquipoUpdate(@PathVariable("id") int id) {

        ModelAndView mav = new ModelAndView();
        Equipo equipo = equipoService.findById(id);
        mav.addObject("equipo", equipo);
        mav.setViewName("equipoUpdate");
        return mav;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateEquipo(@ModelAttribute Equipo equipo) {

        ModelAndView mav = new ModelAndView();
        try {
            equipoService.update(equipo);
            List<Equipo> lista = equipoService.list();
            mav.addObject("lista", lista);
            mav.setViewName("equipo");
            mav.addObject("msg", "Se actualizó correctamente");
            mav.addObject("tipoMensaje", "success");

        } catch (Exception e) {
            mav.addObject("msg", "Error al registrar: " + e.getMessage());
            mav.addObject("tipoMensaje", "danger");
            mav.setViewName("equipoCreate");
        }

        return mav;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteEquipo(@PathVariable("id") Integer id) {

        ModelAndView mav = new ModelAndView();
        equipoService.delete(id);
        List<Equipo> lista = equipoService.list();
        mav.addObject("lista", lista);
        mav.setViewName("equipo");
        mav.addObject("msg", "Se eliminó satisfactoriamente el equipo seleccionado");
        mav.addObject("tipoMensaje", "success");

        return mav;
    }

}

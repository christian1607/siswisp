
package com.codapes.siswisp.controller ;

import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.model.CuentaUsuarioModel;
import com.codapes.siswisp.service.CuentaUsuarioService;
import com.codapes.siswisp.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
@RequestMapping("/cuentaUsuario")
public class CuentaUsuarioController {
    
    @Autowired
    CuentaUsuarioService cuentaUsuarioService;
    
    @Autowired
    UsuarioService usuarioService;
    
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView goCuentaUsuarios() {

        ModelAndView mav = new ModelAndView();
        List<Cuentausuario> lista= cuentaUsuarioService.list();
        mav.setViewName("cuentaUsuario");
        mav.addObject("lista", lista);
        return mav;

    }
    
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public ModelAndView goCuentaUsuarioUpdate(@PathVariable("id") int id) {

        ModelAndView mav = new ModelAndView();
        Cuentausuario cuentausuario=cuentaUsuarioService.findById(id);
        CuentaUsuarioModel cuentaUsuarioModel=new CuentaUsuarioModel();
        
        cuentaUsuarioModel.setId(cuentausuario.getId());
        cuentaUsuarioModel.setPagoMensual(cuentausuario.getPagoMensual());
        cuentaUsuarioModel.setPassword(cuentausuario.getPassword());
        cuentaUsuarioModel.setUser(cuentausuario.getUser());
        cuentaUsuarioModel.setUsuario(cuentausuario.getUsuario().getId());
        cuentaUsuarioModel.setVelocidad(cuentausuario.getVelocidad());
        cuentaUsuarioModel.setFechaInicio(cuentausuario.getFechaInicio());
        mav.setViewName("cuentaUsuarioUpdate");
        mav.addObject("cuentaUsuario", cuentaUsuarioModel);
        return mav;

    }
    
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute("cuentaUsuario") CuentaUsuarioModel cuentaUsuario,BindingResult bindingResult) {
        
        ModelAndView mav = new ModelAndView();
        if(bindingResult.hasErrors()){
           
            mav.addObject("msg", "Error al actualizar: "+bindingResult.getObjectName());
            mav.addObject("tipoMensaje", "danger");
            mav.setViewName("cuentaUsuarioUpdate");
        }
        else{
            try {
               Cuentausuario c=cuentaUsuarioService.findById(cuentaUsuario.getId());
               c.setUsuario(usuarioService.findById(cuentaUsuario.getUsuario()));
               c.setFechaInicio(cuentaUsuario.getFechaInicio());
               c.setPagoMensual(cuentaUsuario.getPagoMensual());
               c.setPassword(cuentaUsuario.getPassword());
               c.setUser(cuentaUsuario.getUser());
               c.setVelocidad(cuentaUsuario.getVelocidad());
               
               cuentaUsuarioService.update(c);
               List<Cuentausuario> lista= cuentaUsuarioService.list();
               mav.addObject("lista", lista);
               mav.setViewName("cuentaUsuario");
               mav.addObject("msg", "Se actualizó correctamente");
               mav.addObject("tipoMensaje", "success");

           } catch (Exception e) {
               mav.addObject("msg", "Error al actualizar: " + e.getMessage());
               mav.addObject("tipoMensaje", "danger");
               mav.setViewName("cuentaUsuarioUpdate");
           }
        
        }
        return mav;
    }
    
    
    
    @RequestMapping(value = "/updates",method = RequestMethod.POST)
    public ModelAndView updateCuentaUsuario(@ModelAttribute("cuentaUsuario") Cuentausuario cuentausuario) {

//        ModelAndView mav = new ModelAndView();
//        try {
//            cuentaUsuarioService.update(cuentaUsuario);
//            List<Cuentausuario> lista= cuentaUsuarioService.list();
//            mav.addObject("lista", lista);
//            mav.setViewName("cuentaUsuario");
//            mav.addObject("msg", "Se actualizó correctamente");
//            mav.addObject("tipoMensaje", "success");
//
//        } catch (Exception e) {
//            mav.addObject("msg", "Error al registrar: " + e.getMessage());
//            mav.addObject("tipoMensaje", "danger");
//            mav.setViewName("cuentaUsuarioUpdate");
//        }
        ModelAndView mav = new ModelAndView();
        List<Cuentausuario> lista= cuentaUsuarioService.list();
        mav.setViewName("cuentaUsuario");
        mav.addObject("lista", lista);
        

        return mav;
    }
    
    
    
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ModelAndView deleteCuentaUsuario(@PathVariable("id") int id){
    
        ModelAndView mav = new ModelAndView();
        cuentaUsuarioService.delete(id);
        List<Cuentausuario> lista= cuentaUsuarioService.list();
        mav.addObject("lista", lista);
        mav.setViewName("cuentaUsuario");
        mav.addObject("msg", "Se eliminó satisfactoriamente el equipo seleccionado");
        mav.addObject("tipoMensaje", "success");

        return mav;
    }
}

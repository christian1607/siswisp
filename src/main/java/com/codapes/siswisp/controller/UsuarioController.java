package com.codapes.siswisp.controller ;

import com.codapes.siswisp.entity.Cuentausuario;
import com.codapes.siswisp.entity.Equipo;
import com.codapes.siswisp.entity.Usuario;
import com.codapes.siswisp.exception.BusinessException;
import com.codapes.siswisp.model.UsuarioModel;
import com.codapes.siswisp.service.EquipoService;
import com.codapes.siswisp.service.UsuarioService;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

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
@RequestMapping("/usuario")
public class UsuarioController {

    
    private static final Logger LOG=Logger.getLogger(UsuarioController.class);
    
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private EquipoService equipoService;

    @RequestMapping(value = "/goUsuarioCreate")
    public ModelAndView goUsuarioCreate() {

        ModelAndView mav = new ModelAndView();
        UsuarioModel usuarioModel = new UsuarioModel();

        List<Equipo> listaEquipo = equipoService.listarEquiposDisponibles();

        mav.addObject("usuarioModel", usuarioModel);
        mav.addObject("listaEquipo", listaEquipo);
        mav.setViewName("usuarioCreate");
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createUsuario(@ModelAttribute UsuarioModel usuarioModel, BindingResult bindingResult) {

       
        ModelAndView mav = new ModelAndView();
        Usuario usuario = new Usuario();
        Cuentausuario cuentausuario = new Cuentausuario();
        try {

            if (bindingResult.hasErrors()) {
                mav.addObject("msg", "Error al registrar: " +bindingResult.getGlobalError().getDefaultMessage());
                mav.addObject("tipoMensaje", "danger");
                mav.setViewName("usuarioCreate");
            } else {

                Equipo equipo = equipoService.findById(usuarioModel.getEquipo());

                usuario.setNombre(usuarioModel.getNombreUsuario());
                usuario.setApellido(usuarioModel.getApellido());
                usuario.setDireccion(usuarioModel.getDireccion());
                usuario.setTelefono(usuarioModel.getTelefono());

                cuentausuario.setUser(usuarioModel.getUser());
                cuentausuario.setPassword(usuarioModel.getPassword());
                cuentausuario.setVelocidad(usuarioModel.getVelocidad());
                cuentausuario.setPagoMensual(usuarioModel.getPagoMensual());
                cuentausuario.setFechaInicio(usuarioModel.getFechaInicio());

                //Formuario antiguo donde se registraba el equipo junto al usuario
//          equipo.setIp(usuarioModel.getIp());
//          equipo.setMac(usuarioModel.getMac());
//          equipo.setNombre(usuarioModel.getNombreEquipo());
                usuarioService.create(usuario, cuentausuario, equipo);

                List<Usuario> lista = usuarioService.list();

                mav.addObject("lista", lista);
                mav.addObject("msg", "Se registró correctamente");
                mav.addObject("tipoMensaje", "success");
                mav.setViewName("usuario");
            }

        } catch (BusinessException e) {
            mav.addObject("msg", e.getDescripcion());
            mav.addObject("tipoMensaje", "danger");
            mav.setViewName("usuarioCreate");
        }
        return mav;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView goUsuarios() {

        ModelAndView mav = new ModelAndView();
        List<Usuario> lista = usuarioService.list();
        mav.setViewName("usuario");
        mav.addObject("lista", lista);
        return mav;

    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView goUsuariosUpdate(@PathVariable("id") int id) {

        ModelAndView mav = new ModelAndView();
        Usuario usuario = usuarioService.findById(id);
        mav.setViewName("usuarioUpdate");
        mav.addObject("usuario", usuario);
        return mav;

    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute Usuario usuario) {
        ModelAndView mav = new ModelAndView();
        try {
            usuarioService.update(usuario);
            Map<String,Object> model=new HashMap<>() ;
            model.put("msg", "Usuario actualizado correctamente");
            model.put("tipoMensaje", "success");
         //   mav.addObject("msg", "Usuario actualizado correctamente");
         //   mav.addObject("tipoMensaje", "success");
            mav.setViewName("usuario"); 
           return  new ModelAndView("redirect:/usuario/index");

        } catch (Exception e) {
            mav.addObject("msg", "Error al actualizar Usuario: "+e.getMessage());
            mav.addObject("tipoMensaje", "error");
            mav.setViewName("usuarioUpdate"); 
           return mav;
            
        }

    }

}

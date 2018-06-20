package com.codapes.siswisp.controller ;

import com.codapes.siswisp.entity.Pago;
import com.codapes.siswisp.model.PagoModel;
import com.codapes.siswisp.service.PagoService;
import com.codapes.siswisp.service.UsuarioService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Christian
 */
@Controller
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoService pagoService;
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/index")
    public ModelAndView goPagos() {

        ModelAndView mav = new ModelAndView();
        List<Pago> lista = pagoService.listarPago();

        mav.addObject("lista", lista);
        mav.setViewName("pago");
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mav = new ModelAndView();
        PagoModel pago = new PagoModel();
        mav.addObject("usuarios", usuarioService.list());
        mav.addObject("pago", pago);
        mav.setViewName("pagoCreate");
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute PagoModel pagoModel, BindingResult bindingResult) {
        ModelAndView mav = new ModelAndView();
        if (bindingResult.hasErrors()) {
            mav.addObject("msg", "Error al registrar: ");
            mav.addObject("tipoMensaje", "danger");
            mav.setViewName("pagoCreate");

        } else {
            Pago pago = new Pago();
            pago.setUsuario(usuarioService.findById(pagoModel.getUsuario()));
            pago.setFecha(new Date());
            pago.setMonto(pagoModel.getMonto());
            pago.setConceptoPago(pagoModel.getConceptoPago());

            pagoService.registrarPago(pago);
            List<Pago> lista = pagoService.listarPago();
            mav.addObject("lista", lista);
            mav.addObject("msg", "Se registró correctamente");
            mav.addObject("tipoMensaje", "success");
            mav.setViewName("pago");

        }
        return mav;
    }

}

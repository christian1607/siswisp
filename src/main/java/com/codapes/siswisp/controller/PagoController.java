package com.codapes.siswisp.controller;

import com.codapes.siswisp.entity.Pago;
import com.codapes.siswisp.model.PagoModel;
import com.codapes.siswisp.service.PagoService;
import com.codapes.siswisp.service.UsuarioService;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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

            if (Optional.ofNullable(pagoModel.getId()).isPresent()) {
                pago.setId(pagoModel.getId());
                pagoService.updatePago(pago);
                mav.addObject("msg", "Se actualizó pago correctamente");
            } else {
                pagoService.registrarPago(pago);
                mav.addObject("msg", "Se registró pago correctamente");
            }
            List<Pago> lista = pagoService.listarPago();
            mav.addObject("lista", lista);
            mav.addObject("tipoMensaje", "success");
            mav.setViewName("pago");

        }
        return mav;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public ModelAndView showViewUpdatePago(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();

        Pago pago;

        pago = pagoService.findPagoById(id);
        PagoModel model = new PagoModel();
        model.setConceptoPago(pago.getConceptoPago());
        model.setFecha(pago.getFecha());
        model.setId(pago.getId());
        model.setMonto(pago.getMonto());
        model.setUsuario(pago.getUsuario().getId());

        mav.addObject("pago", pago);
        mav.addObject("usuarios", usuarioService.list());
        mav.setViewName("pagoCreate");

        return mav;
    }

}

package com.codapes.siswisp.service;

import com.codapes.siswisp.entity.Pago;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface PagoService {

    public void registrarPago(Pago pago);

    public void updatePago(Pago pago);

    public List<Pago> listarPago();

    public Pago findPagoById(int id);
}

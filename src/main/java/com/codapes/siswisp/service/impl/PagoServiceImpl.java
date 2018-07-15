package com.codapes.siswisp.service.impl;

import com.codapes.siswisp.dao.PagoDao;
import com.codapes.siswisp.dao.impl.EntityDaoImpl;
import com.codapes.siswisp.entity.Pago;
import com.codapes.siswisp.service.PagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christian
 */
@Service
public class PagoServiceImpl extends EntityDaoImpl<Pago> implements PagoService {

    @Autowired
    private PagoDao pagoDao;

    @Override
    public void registrarPago(Pago pago) {
        createT(pago);
    }

    @Override
    public List<Pago> listarPago() {

        return listT(Pago.class);
    }

    @Override
    public Pago findPagoById(int id) {
        return findById(Pago.class, id);
    }

    @Override
    public void updatePago(Pago pago) {
        updateT(pago);
    }

}

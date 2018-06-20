
package com.codapes.siswisp.dao;


import com.codapes.siswisp.entity.Pago;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface PagoDao {


public void create(Pago pago);

public List<Pago> list();
}

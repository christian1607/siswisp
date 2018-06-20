package com.codapes.siswisp.model;


import java.util.Date;

/**
 *
 * @author Christian
 */
public class PagoModel {


    private Integer usuario;
    private Date fecha;
    private double monto;
    private String conceptoPago;

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }
    
    
    
    
}

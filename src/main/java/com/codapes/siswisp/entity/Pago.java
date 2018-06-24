package com.codapes.siswisp.entity;
// Generated 03/08/2016 04:56:43 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pago generated by hbm2java
 */
@Entity
@Table(name = "PAGO", schema = "SISWISP")
public class Pago implements java.io.Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "USUARIO_ID")
    private Usuario usuario;
    
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name = "MONTO")
    private double monto;
    
    @Column(name = "CONCEPTO_PAGO")
    private String conceptoPago;

    public Pago() {
    }

    public Pago(Usuario usuario, Date fecha, double monto, String conceptoPago) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.monto = monto;
        this.conceptoPago = conceptoPago;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConceptoPago() {
        return this.conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

}

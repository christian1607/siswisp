
package com.codapes.siswisp.model;


import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Christian
 */
public class CuentaUsuarioModel {
    
      private Integer id;
     private int usuario;
     private String user;
     private String password;
     private String velocidad;
     private long pagoMensual;
     @DateTimeFormat(pattern = "dd/MM/yyyy")
     private Date fechaInicio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public long getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(long pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



}

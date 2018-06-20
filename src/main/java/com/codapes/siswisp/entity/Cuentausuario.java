package com.codapes.siswisp.entity;
// Generated 03/08/2016 04:56:43 PM by Hibernate Tools 4.3.1


import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Cuentausuario generated by hbm2java
 */
public class Cuentausuario  implements java.io.Serializable {


     private Integer id;
     private Usuario usuario;
     private String user;
     private String password;
     private String velocidad;
     private long pagoMensual;
     @DateTimeFormat(pattern = "dd/MM/yyyy")
     private Date fechaInicio;

    public Cuentausuario() {
    }

    public Cuentausuario(Usuario usuario, String user, String password, String velocidad, long pagoMensual, Date fechaInicio) {
       this.usuario = usuario;
       this.user = user;
       this.password = password;
       this.velocidad = velocidad;
       this.pagoMensual = pagoMensual; 
       this.fechaInicio = fechaInicio;
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
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getVelocidad() {
        return this.velocidad;
    }
    
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    public long getPagoMensual() {
        return this.pagoMensual;
    }
    
    public void setPagoMensual(long pagoMensual) {
        this.pagoMensual = pagoMensual;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }




}



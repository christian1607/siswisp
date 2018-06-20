
package com.codapes.siswisp.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


public class UsuarioModel {
 
   
    //Usuario
    private String nombreUsuario;
    private String apellido;
    private String direccion;
    private String telefono;
    
    //Equipo
   private int equipo;
 
    
    //CuentaUsuario
   
    private String user;
    private String password;
    private String velocidad;
    private long pagoMensual;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaInicio;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getEquipo() {
        return equipo;
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

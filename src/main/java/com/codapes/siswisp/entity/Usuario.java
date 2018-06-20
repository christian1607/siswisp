package com.codapes.siswisp.entity;
// Generated 03/08/2016 04:56:43 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private Set equipos = new HashSet(0);
     private Set cuentausuarios = new HashSet(0);
     private Set pagos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Usuario(String nombre, String apellido, String direccion, String telefono, Set equipos, Set cuentausuarios, Set pagos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.telefono = telefono;
       this.equipos = equipos;
       this.cuentausuarios = cuentausuarios;
       this.pagos = pagos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Set equipos) {
        this.equipos = equipos;
    }
    public Set getCuentausuarios() {
        return this.cuentausuarios;
    }
    
    public void setCuentausuarios(Set cuentausuarios) {
        this.cuentausuarios = cuentausuarios;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}



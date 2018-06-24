package com.codapes.siswisp.entity;
// Generated 03/08/2016 04:56:43 PM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "USUARIO", schema = "SISWISP")
public class Usuario implements java.io.Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Equipo equipos;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Cuentausuario cuentausuarios;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pago> pagos = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Usuario(Integer id, String nombre, String apellido, String direccion, String telefono, Equipo equipos, Cuentausuario cuentausuarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.equipos = equipos;
        this.cuentausuarios = cuentausuarios;
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

    public Equipo getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo equipos) {
        this.equipos = equipos;
    }

    public Cuentausuario getCuentausuarios() {
        return cuentausuarios;
    }

    public void setCuentausuarios(Cuentausuario cuentausuarios) {
        this.cuentausuarios = cuentausuarios;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }



}

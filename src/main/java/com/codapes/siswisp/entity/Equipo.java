package com.codapes.siswisp.entity;
// Generated 03/08/2016 04:56:43 PM by Hibernate Tools 4.3.1

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Equipo generated by hbm2java
 */
@Entity
@Table(name = "EQUIPO", schema = "SISWISP")
public class Equipo implements java.io.Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @JoinColumn(name = "USUARIO_ID")
    @OneToOne
    private Usuario usuario;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "MAC")
    private String mac;
    
    @Column(name = "IP")
    private String ip;

    public Equipo() {
    }

    public Equipo(String nombre, String mac, String ip) {
        this.nombre = nombre;
        this.mac = mac;
        this.ip = ip;
    }

    public Equipo(Usuario usuario, String nombre, String mac, String ip) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.mac = mac;
        this.ip = ip;
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}

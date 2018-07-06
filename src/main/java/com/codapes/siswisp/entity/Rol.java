/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codapes.siswisp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES", schema = "SECURITY")
public class Rol {
    
    @Id
    @Column(name = "username")
    private String username;
    
    @Column(name = "authority")
    private String role;
    
    
    @ManyToOne
    @JoinColumn(name = "username")
//    @PrimaryKeyJoinColumn(name = "username",referencedColumnName = "username")
    @MapsId
    private Users user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
  
    
    
    
}

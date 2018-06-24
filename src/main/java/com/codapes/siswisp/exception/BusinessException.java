/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codapes.siswisp.exception;

/**
 *
 * @author toshiba
 */
public class BusinessException extends Exception {

    private String tipoError;
    private String descripcion;

    public BusinessException(String tipoError, String descripcion) {
        this.tipoError = tipoError;
        this.descripcion = descripcion;
    }

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}

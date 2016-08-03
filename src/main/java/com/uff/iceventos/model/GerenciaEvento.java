/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.iceventos.model;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arossetto
 */
@Named(value = "gerenciaEvento")
@SessionScoped
public class GerenciaEvento implements Serializable {

    /**
     * Creates a new instance of GerenciaEvento
     */
    List <Evento> eventosCadastrados = new ArrayList<>();
    public GerenciaEvento() {
    }
    
    public List<Evento> eventos(){
        return eventosCadastrados;
    }
    
    
}

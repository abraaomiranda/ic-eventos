/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.iceventos.model;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author arossetto
 */
@Named(value = "evento")
@RequestScoped
public class Evento {

    /**
     * Creates a new instance of Evento
     */
    
    private String descricao;
    private Date dataInicio, dataFim;
    private boolean aprovado;
    
    public Evento() {
    }

    public Evento(String descricao, Date dataInicio, Date dataFim, boolean aprovado) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.aprovado = aprovado;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}

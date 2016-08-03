/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.iceventos.model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author arossetto
 */
@Named(value = "usuario")
@RequestScoped
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    
    public Usuario() {
        this.nome = "";
        this.email = "";
        this.senha = "";
        this.admin = false;
    }

    public Usuario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public boolean equals(Object o){
        return ((Usuario)o).getEmail().equals(this.getEmail());
    }
    
}

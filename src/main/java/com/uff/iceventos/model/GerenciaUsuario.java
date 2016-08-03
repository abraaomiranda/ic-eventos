/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uff.iceventos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author arossetto
 */
@Named(value = "gerenciaUsuario")
@SessionScoped
public class GerenciaUsuario implements Serializable{

    /**
     * Creates a new instance of MembrosBean
     */
    public GerenciaUsuario() {
    }
    private String nome, email, senha;
    List<Usuario> usuariosCadastrados = new ArrayList<>();
    static Usuario usuario_corrente;
    
    public String cadastrarUsuario(Usuario novoUsuario){
        int achou = usuariosCadastrados.indexOf(novoUsuario);
        if(achou == -1){
            usuariosCadastrados.add(novoUsuario);
            return "successCadastro.xhtml";
        }else{
            return "errorCadastro.xhtml";
        }
    }
    
    public String validarLogin(Usuario usuario){
        int achou = usuariosCadastrados.indexOf(usuario);
        if(achou == -1){
            return "errorEmailLogin.xhtml";
        }
        Usuario usuario_encontrado = usuariosCadastrados.get(achou);
        if(usuario_encontrado.getSenha().equals(usuario.getSenha())){
            usuario_corrente = usuario_encontrado;
            return "successLogin.xhtml";
        }
        return "errorSenhaLogin.xhtml";
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36.labs;

/**
 *
 * @author thiago
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String obterInfo(){
        
        return "Nome = " + nome + "; " +
                "Telefone = " + telefone + "; " +
                "Email = " + email + "; ";
    }
    
    
}

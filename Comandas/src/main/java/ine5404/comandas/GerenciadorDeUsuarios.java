/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author martin
 */
public class GerenciadorDeUsuarios implements Serializable {
    protected Map<String, String> mapaLoginSenha;
    
    public GerenciadorDeUsuarios(){
        this.mapaLoginSenha = new HashMap<>();
    }
    
    public void addLoginSenha(String login, String senha){
        this.mapaLoginSenha.put(login, senha);
    }
    
    public boolean autenticar(String login, String senha){        
        if(this.mapaLoginSenha.containsKey(login))
            return this.mapaLoginSenha.get(login).equals(senha);
        
        return false;        
    }
}

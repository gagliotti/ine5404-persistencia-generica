/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author martin.vigil
 */
public class Main {
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException{
        //GerenciadorDeUsuarios genUsr = new GerenciadorDeUsuarios();
        //genUsr.addLoginSenha("jose", "123");
        //genUsr.addLoginSenha("carlos", "abc");
        
        Persistencia<GerenciadorDeUsuarios> pers = new Persistencia<>();
        //pers.gravar(genUsr, "genusr.bin");
        
        GerenciadorDeUsuarios genUsr = pers.ler("genusr.bin");
        
        System.out.println(genUsr.autenticar("jose", "123"));
    }
}

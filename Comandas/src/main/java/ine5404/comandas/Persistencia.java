/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author martin
 */
public class Persistencia<E> {
    
    public E ler(String nomeDoArquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(nomeDoArquivo);
        ObjectInputStream ois = new ObjectInputStream(fis);        
        E obj = (E) ois.readObject();
        ois.close();
        return obj;
    }
    
    public void gravar(E objeto, String nomeDoArquivo) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nomeDoArquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(objeto);
        oos.close();
    }
}

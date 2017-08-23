/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author martin
 */
public class Comanda implements Serializable{
    protected Cliente cliente;
    protected List pedidos;

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
        this.pedidos = new ArrayList<>();
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public double getTotal(){
        Iterator<Pedido> it = this.pedidos.iterator();
        double valor = 0;
        
        while(it.hasNext())
            valor += it.next().getValor();
        
        return valor;
            
    }
}

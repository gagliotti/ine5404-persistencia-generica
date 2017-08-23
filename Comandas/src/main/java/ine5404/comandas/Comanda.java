/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

/**
 *
 * @author martin
 */
public class Comanda {
    protected Cliente cliente;
    //faca uma lista de pedidos

    public Comanda(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addPedido(Pedido pedido){
        //implementar
    }
    
    public double getTotal(){
        //implementar        
        return -1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import creadorAbstracto.cliente;
import creadorconcreto.clientecontado;
import creadorconcreto.clientecredito;

/**
 *
 * @author HARGEZ
 */
public class main {
    
    public static void main(String[] args) {
        cliente cliente;
        cliente = new clientecontado();
        cliente.nuevopedido(2000);
        cliente.nuevopedido(1000);
        
        cliente = new clientecredito();
        cliente.nuevopedido(2000);
        cliente.nuevopedido(1000);
    }
    
}

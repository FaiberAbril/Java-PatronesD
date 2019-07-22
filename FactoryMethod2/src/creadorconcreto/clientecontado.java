/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadorconcreto;

import creadorAbstracto.Pedido;
import creadorAbstracto.cliente;

/**
 *
 * @author HARGEZ
 */
public class clientecontado extends cliente{

    @Override
    protected Pedido creaPedido(double imporete) {
        return new PedidoContado(imporete);
    }
    
}

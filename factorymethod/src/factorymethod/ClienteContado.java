/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author HARGEZ
 */
public class ClienteContado extends Cliente{

    @Override
    protected Pedido crearPedido(double imiporte) {
         return new PedidoContado(imiporte);
    }
    
}

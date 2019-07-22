/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creadorAbstracto;

import creadorAbstracto.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HARGEZ
 */
public abstract class cliente {

    protected List<Pedido> pedidos = new ArrayList<>();

    protected abstract Pedido creaPedido(double imporete);

    public void nuevopedido(double importe) {
        Pedido pedido = this.creaPedido(importe);
        if (pedido.valida()) {
           pedido.paga();
           pedidos.add(pedido);
        }

    }
}

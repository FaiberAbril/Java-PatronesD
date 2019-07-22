package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    protected List<Pedido> pedidos = new ArrayList<Pedido>();

    protected abstract Pedido crearPedido(double imiporte);

    public void nuevoPedido(double importe) {
        Pedido pedido = this.crearPedido(importe);
        if (pedido.valida()) {
            pedido.paga();
            pedidos.add(pedido);

        }

    }

}

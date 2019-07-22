package factorymethod;

public class main {

    
    public static void main(String[] args) {
         Cliente cliente = new ClienteContado();
         cliente.nuevoPedido(2000);
         cliente.nuevoPedido(1000);
         cliente = new ClienteCredito();
         cliente.nuevoPedido(2000);
         cliente.nuevoPedido(10000);
         
    }
   
    
    
    
    
}

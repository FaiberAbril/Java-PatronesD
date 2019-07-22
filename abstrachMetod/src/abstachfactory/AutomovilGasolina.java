
package abstachfactory;


public class AutomovilGasolina extends Automovil{

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracterisitiacas() {
     System.out.println("Automovil gasolina "
             + ""+ modelo + " de color "+ color +""
             + " "+ "de potencia "+ potencia + "de espacio "
             + " "+ espacio);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstachfactory;

/**
 *
 * @author HARGEZ
 */
public class AutomovilElectrico extends Automovil{

    public AutomovilElectrico(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracterisitiacas() {
     System.out.println("Automovil electrico "
             + ""+ modelo + " de color "+ color +""
             + " "+ "de potencia "+ potencia + "de espacio "
             + " "+ espacio);
    }
    
}

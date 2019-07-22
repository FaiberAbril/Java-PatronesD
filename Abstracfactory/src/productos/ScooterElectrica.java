/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import productoAbstracto.Scooter;

/**
 *
 * @author HARGEZ
 */
public class ScooterElectrica extends Scooter {

    public ScooterElectrica(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarcaracteristicas() {
        System.out.println("moto electrico modelo " + modelo
                + "de color " + color + "de potencia " + potencia
               );

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import productoAbstracto.Automovil;
import productoAbstracto.Scooter;
import productos.AutomovilGasolina;
import productos.ScooterGasolina;

/**
 *
 * @author HARGEZ
 */
public class FabricaVehiculosGasolina implements FabricaVehiculos{

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
      return new AutomovilGasolina(modelo, color, potencia, espacio);
      
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
      return new ScooterGasolina(modelo, color, potencia);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import productoAbstracto.Automovil;
import productoAbstracto.Scooter;

/**
 *
 * @author HARGEZ
 */
public interface FabricaVehiculos {
    Automovil crearAutomovil(String modelo, String color , int potencia , double espacio);
    Scooter crearScooter(String modelo, String color , int potencia);
}

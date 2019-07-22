/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import fabrica.FabricaVehiculosElectricos;
import fabrica.FabricaVehiculosGasolina;
import java.util.Scanner;
import productoAbstracto.Automovil;
import productoAbstracto.Scooter;

/**
 *
 * @author HARGEZ
 */
public class main {
    
    public static int nautos = 3;
    public static int nscooter = 2;


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        fabrica.FabricaVehiculos fabrica;
        
        Automovil[] autos = new Automovil[nautos];
        Scooter[] scooter = new Scooter[nscooter];
        
        System.out.println("Desea utilizar"+
                "(1) vehiculos electricos"+
                "(2) vehiculos a gasolina");
        
        String eleccion = reader.next();
        
        if(eleccion.equals("1")){
          fabrica = new FabricaVehiculosElectricos();
        }else{
          fabrica = new FabricaVehiculosGasolina();
        }
        
        for(int i = 0; i < nautos ; i++){
          autos[i] = fabrica.crearAutomovil("estandar","amarillo", 6+i, 3.6);
        }
        
          for(int i = 0; i < nscooter ; i++){
          scooter[i] = fabrica.crearScooter("clasico", "rojo", i+2);
        }
        
        
          for(Automovil auto : autos){
             auto.mostrarcaracterisiticas();
          }
          
          for(Scooter scorte : scooter){
               scorte.mostrarcaracteristicas();
          }
        
        
        
        
        
        
    }
    
    
    
    
    
}


package abstachfactory;

import java.util.Scanner;


public class main {
    public static int nautos = 3;
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculos fabrica;
        Automovil aut;
       

        System.out.println("desea utilizar vehiculos (1)"
                + "gasolina o (2) electrico");
        int eleccion = reader.nextInt();
        
        if(eleccion == 1){
          fabrica = new FabricaVehiculosGasolina();
          aut = fabrica.creaAutomovil("2016","rojo",6,2);
          aut.mostrarCaracterisitiacas();
        }else{
          fabrica = new FabricaVehiculosElectricos();
           aut = fabrica.creaAutomovil("2014","Amarillo",6,2);
           aut.mostrarCaracterisitiacas();
        }
        
     

        
    }
    
    
    
}

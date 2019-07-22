/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import constructorconcreto.Documentacion;
import constructorAbstracto.constructorDocumentacinVehiculo;
import constructorAbstracto.constructordocumentacionvehiculohtml;
import constructorAbstracto.contructordocumentacionvehiculospdf;
import director.Vendedor;
import java.util.Scanner;

/**
 *
 * @author HARGEZ
 */
public class ClienteVehiculo {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        constructorDocumentacinVehiculo constructor;
        
        System.out.println("desea generar docuemtentacaion "
                + "(1) html"
                + " (2) pdf");
        
       String seleccion = reader.next();
       
       if(seleccion.equals("1")){
            constructor = new constructordocumentacionvehiculohtml();
       }else{
          constructor = new contructordocumentacionvehiculospdf();
       }
       
        Vendedor vendedor = new Vendedor(constructor);
        
        Documentacion documentacion = vendedor.construye("martin");
        documentacion.imprime();
        
       
       
    }
    
}

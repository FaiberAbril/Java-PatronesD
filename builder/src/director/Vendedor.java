/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package director;

import constructorconcreto.Documentacion;
import constructorAbstracto.constructorDocumentacinVehiculo;

/**
 *
 * @author HARGEZ
 */
public class Vendedor {
    protected constructorAbstracto.constructorDocumentacinVehiculo constructor;

    public Vendedor(constructorDocumentacinVehiculo constructor) {
        this.constructor = constructor;
    }
    
   public Documentacion construye(String nombreCliente){
       constructor.construyeSolicitudPedido(nombreCliente);
       constructor.construyeSolicitudmatricula(nombreCliente);
       Documentacion documentacion = constructor.resultado();
       return documentacion;
   
   }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorAbstracto;

import constructorAbstracto.constructorDocumentacinVehiculo;
import constructorconcreto.Documentacionhtml;

/**
 *
 * @author HARGEZ
 */
public class contructordocumentacionvehiculospdf extends constructorDocumentacinVehiculo{
  
     public contructordocumentacionvehiculospdf() {
      documentacion = new Documentacionhtml();
    }


    @Override
    public void construyeSolicitudPedido(String nombrecliente) {
       String documento;
        documento ="<PDF> solicitud del cliente:"+ nombrecliente+"<PDF>";
        documentacion.agregarDocumento(documento);
    }
     @Override
    public void construyeSolicitudmatricula(String nombreSolicitandte) {
        String documento;
        documento = "<pdf> solicitud del cliente:" + nombreSolicitandte + "<pdf>";
        documentacion.agregarDocumento(documento);
    }
    
    
    
}

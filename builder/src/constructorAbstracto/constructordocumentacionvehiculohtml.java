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
public class constructordocumentacionvehiculohtml extends constructorDocumentacinVehiculo {

    public constructordocumentacionvehiculohtml() {
        documentacion = new Documentacionhtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombrecliente) {
        String documento;
        documento = "<html> solicitud del cliente:" + nombrecliente + "<html>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudmatricula(String nombreSolicitandte) {
        String documento;
        documento = "<html> solicitud del cliente:" + nombreSolicitandte + "<html>";
        documentacion.agregarDocumento(documento);
    }
}

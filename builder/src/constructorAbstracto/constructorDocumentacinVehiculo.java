package constructorAbstracto;

import constructorconcreto.Documentacion;

public abstract class constructorDocumentacinVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombrecliente);

    public abstract void construyeSolicitudmatricula(String nombreSolicitandte);

    public Documentacion resultado() {
        return documentacion;
    }
;

}

package builder.constructores;

import builder.documentacion.Documentacion;

public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;
    
    public abstract void construyeSolicitudPedido(String nombreCliente);
    
    public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);
    
    public Documentacion resultado() {
        return documentacion;
    }
    
}

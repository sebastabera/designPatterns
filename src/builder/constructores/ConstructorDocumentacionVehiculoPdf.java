package builder.constructores;

import builder.documentacion.DocumentacionPdf;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf() {
        documentacion = new DocumentacionPdf();
    }
    
    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente: " +
        nombreCliente + "</PDF>";
        documentacion.agregaDocumento(documento);
        
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<PDF>Solicitud de matriculacion Solicitante: " +
        nombreSolicitante + "</PDF>";
        documentacion.agregaDocumento(documento);
        
    }

}

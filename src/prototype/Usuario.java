package prototype;

import prototype.documentacion.DocumentacionCliente;
import prototype.documentacion.DocumentacionEnBlanco;
import prototype.documento.CertificadoCesion;
import prototype.documento.OrdenDePedido;
import prototype.documento.SolicitudMatriculacion;

public class Usuario {

    public static void main(String[] args) {
      //inicializacion de la documentacion en blanco
        DocumentacionEnBlanco documentacionEnBlanco =
        DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        // creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 =
        new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 =
        new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
    
}

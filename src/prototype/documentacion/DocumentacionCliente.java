package prototype.documentacion;

import java.util.ArrayList;
import java.util.List;
import prototype.documento.Documento;

public class DocumentacionCliente extends Documentacion {
    
    public DocumentacionCliente(String informacion) {
        documentos = new ArrayList<>();
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        List<Documento> documentosEnBlanco = documentacionEnBlanco.getDocumentos();
        
        documentosEnBlanco.forEach(doc -> {
            Documento copiaDocumento = doc.duplica();
            copiaDocumento.rellena(informacion);
            documentos.add(copiaDocumento);
        });
    }
    
    public void visualiza() {
        documentos.forEach(doc -> {
            doc.visualiza();
        });
    }
    
    public void imprime() {
        documentos.forEach(doc -> {
            doc.imprime();
        });
    }
    
}

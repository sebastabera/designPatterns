package prototype.documentacion;

import java.util.List;
import prototype.documento.Documento;

public abstract class Documentacion {
    
    protected List<Documento> documentos;
    
    public List<Documento> getDocumentos(){
        return documentos;
    }
    
}

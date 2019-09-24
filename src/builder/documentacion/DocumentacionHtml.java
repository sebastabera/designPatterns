package builder.documentacion;

public class DocumentacionHtml extends Documentacion{

    @Override
    public void agregaDocumento(String documento) {
        if(documento.startsWith("<HTML>")) {
            contenido.add(documento);
        }        
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion HTML");
        for(String s : contenido)
            System.out.println(s);
    }

}

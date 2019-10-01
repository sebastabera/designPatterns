package singleton;

public class TestComercial {

    public static void main(String[] args) {
        // inicialización del comercial en el sistema
        Comercial elComercial = Comercial.getInstance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com");
        // muestra el comercial del sistema
        visualiza();
    }

    public static void visualiza() {
        Comercial elComercial = Comercial.getInstance();
    }

}

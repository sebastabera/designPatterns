package singleton;

public class Comercial {

    protected String nombre;
    protected String direccion;
    protected String email;

    protected static Comercial _instance = null;

    private Comercial() {
    }

    public static Comercial getInstance() {
        if (_instance == null) {
            _instance = new Comercial();
        }
        return _instance;
    }

    public void visualiza() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direcci�n: " + direccion);
        System.out.println("Email: " + email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

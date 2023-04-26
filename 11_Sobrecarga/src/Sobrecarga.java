
public class Sobrecarga {
    
    private String nombre;
    private int edad;
    private String direccion;

    // constructor
    public Sobrecarga(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // método 1
    public void sobrecarga(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // método 2
    public void sobrecarga(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // método 3
    public void sobrecarga() {
        this.nombre = null;
        this.edad = 0;
        this.direccion = null;
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(direccion);
    }
    
    // método 4
    public void sobrecarga(Sobrecarga sbr) {
        this.nombre = sbr.getNombre();
        this.edad = sbr.getEdad();
        this.direccion = sbr.getDireccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombres(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
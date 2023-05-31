
interface Persona {
    String miNombre();
    String miPosicion();
    int miEdad();
}

public class Caracteres implements Persona {

    public Caracteres() {
        System.out.println("Hola Mundo");
    }
    
    public void miPropioMetodo() {
        System.out.println("Hola desde mi propio metodo");
    }
    
    @Override
    public String miNombre() {
        return String.format("Mi nombre es %s\n", "Juan");
    }

    @Override
    public String miPosicion() {
        return String.format("Mi posicion es %s\n", "Profesor");
    }

    @Override
    public int miEdad() {
        return 20;
    }
}
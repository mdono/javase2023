
public class Animal extends Thread {

    private String nombre;
    
    public Animal(int prioridad, String nombre) {
        this.nombre = nombre;
        setPriority(prioridad);
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            Thread.yield();
        }
        
        System.out.println("Llega " + nombre);
    }
}
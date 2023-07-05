
public class Amigo implements Runnable {

    private String mensaje;
    
    public Amigo(String nombre) {
        mensaje = "Hola, mi nombre es "
                + nombre
                + " y este es el mensaje ";
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String msg = mensaje + i;//a - b
            System.out.println(msg);
            Thread.yield();
        }
    }
}

public class Manuel {

    public static void main(String[] args) {
        Thread Juan = new Thread(new Amigo("Juan"));//a - 1
        Thread Luis = new Thread(new Amigo("Luis"));//b - 1
        Thread Nora = new Thread(new Amigo("Nora"));//a 2 - b 5
        
        Juan.start();
        Luis.start();
        Nora.start();
        
        try {
            Juan.join();
            Luis.join();
            Nora.join();
        } catch (InterruptedException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
}

public class Manuel {

    private static Animal tortuga, liebre, guepardo;
    
    public static void main(String[] args) {
        tortuga = new Animal(2, "T");
        liebre = new Animal(3, "L");
        guepardo = new Animal(4, "G");
        
        tortuga.start();
        liebre.start();
        guepardo.start();
        
        try {
            tortuga.join();
            liebre.join();
            guepardo.join();
        } catch (InterruptedException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
}
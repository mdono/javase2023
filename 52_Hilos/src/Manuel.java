
public class Manuel {

    private final long TIEMPO = 5000;
    
    public static void main(String[] args) {
        Manuel instancia = new Manuel();
        instancia.miMetodo();
    }
    
    private void miMetodo() {
        try {
            Thread.currentThread().sleep(TIEMPO);
            //System.out.println("Hola Mundo!!!");
        } catch (InterruptedException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
        
        System.out.println("Hola Mundo!!!");
    }
}
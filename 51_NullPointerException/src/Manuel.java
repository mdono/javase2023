
public class Manuel {

    private static String cadena = null;
    
    public static void main(String[] args) {
        System.out.println("Valor de la cadena: " + cadena);
        
        try {
            //cadena = "Manuel";
            //cadena = new String("Manuel");
            cadena = miFuncion();
            System.out.println(cadena.charAt(3));
        } catch (NullPointerException e) {
            System.err.println("Err: " + e.getMessage());
        }
    }

    private static String miFuncion() {
        //return null;
        return "Manuel";
    }
}

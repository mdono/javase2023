
public class Manuel {

    public static void main(String[] args) {
        // Parser - Cast
        // Parser: Extraer de un campo de texto un valor numérico
        String cadenaEntero = "123";
        String cadenaEntero1 = "123.45";
        
        //enteros
        int entero = Integer.parseInt(cadenaEntero);
        long entero3 = Long.parseLong(cadenaEntero);
        
        //con decimales
        double entero1 = Double.parseDouble(cadenaEntero1);
        float entero2 = Float.parseFloat(cadenaEntero1);
        
        System.out.println("entero: " + entero);
        System.out.println("entero suma: " + entero + entero);
        System.out.println("entero1: " + entero1);
        System.out.println("entero1 suma: " + (entero1 + entero1));
        System.out.println("entero2: " + entero2);
        System.out.println("entero2 suma: " + (entero2 + entero2));
        System.out.println("entero3: " + entero3);
        System.out.println("entero3 suma: " + (entero3 + entero3));
    }
}
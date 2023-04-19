
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Manuel {

    public static void main(String[] args) {
        String texto = null;
        int i = 0;
        
        System.out.println("Introduzca un valor entero");
        
        try {
            InputStreamReader conversor = 
                    new InputStreamReader(System.in);
            BufferedReader entrada = 
                    new BufferedReader(conversor);
            texto = entrada.readLine();
            i = Integer.parseInt(texto); // parse 
        } catch(IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
        System.out.println("cadena: " + texto);
        System.out.println("cadena: " + (texto + texto));
        System.out.println("entero: " + i);
        System.out.println("entero: " + (i + i));
    }
}
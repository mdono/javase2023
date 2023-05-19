
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Manuel {

    public static void main(String[] args) {
        final Formatter x;
        
        try {
            x = new Formatter("manuel.txt");
            System.out.println("Has creado un archivo");
        } catch (FileNotFoundException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
}
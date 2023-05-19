
import java.io.FileNotFoundException;
import java.util.Formatter;

public class EscribeFile {
    
    public Formatter x;
    
    public final void abrirArchivo() {
        try {
            x = new Formatter("manuel.txt");
        } catch (FileNotFoundException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public final void escribirArchivo() {
        x.format("%s %s %s %s", "Manuel", "Edgardo", "Doño", "Lobo");
    }
    
    public final void cerrarArchivo() {
        x.close();
        System.out.println("Archivo grabado");
    }
}
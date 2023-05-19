
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeeFile {
    
    private Scanner x;
    
    public final void abrirArchivo() {
        try {
            x = new Scanner(new File("C:\\manuel\\nba.txt"));
        } catch (FileNotFoundException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public final void leerArchivo() {
        while (x.hasNext()) {
            String a = x.nextLine();
            
            /*
            String b = x.next();
            String c = x.next();
            */
            
            /*
            String d = x.next();
            String e = x.next();
            String f = x.next();
            String g = x.next();
            String h = x.next();
            String i = x.next();
            */
            
            //System.out.printf("%s %s %s\n%s %s %s\n%s %s %s\n", a, b, c, d, e, f, g, h, i);
            //System.out.printf("%s %s %s\n", a, b, c);
            System.out.printf("%s\n", a);
        }
    }
    
    public final void cerrarArchivo() {
        x.close();
    }
}

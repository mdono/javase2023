
import java.util.Scanner;

public class Guatemala {

    public static void main(String[] args) {
        int a, b, c;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un primer valor entero");
        a = x.nextInt();
        
        System.out.println("Ingrese un segundo valor entero");
        b = x.nextInt();
        
        c = (a + b);
        //int c = x.nextInt() + x.nextInt();
        //String + in = String
        //int + int = int
        
        //System.out.println("Resultado1: " + x.nextInt() + x.nextInt());
        System.out.println("Resultado2: " + (a + b));
        System.out.println("Resultado3: " + c);
    }
}
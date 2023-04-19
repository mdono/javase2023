
public class Guatemala {

    public static void main(String[] args) {
        // tipo + nombre + valor (opcional)
        int x = 0, y = -5;
        //  ***** 0 *****
        // -5
        boolean compara;
        
        compara = x < y;
        System.out.println("X<Y es: " + compara);
        
        compara = x > y;
        System.out.println("X>Y es: " + compara);
        
        // = ASIGNACION, == COMPARACION === IDENTICO
        compara = (x == y);
        System.out.println("X==Y es: " + compara);
        
        compara = x <= y;
        System.out.println("X<=Y es: " + compara);
        
        compara = x >= y;
        System.out.println("X>=Y es: " + compara);
        
        compara = (x != y);
        System.out.println("X!=Y es: " + compara);
        
        // tabla de la verdad
        compara = x <= y && x>=y;
        System.out.println("x <= y && x>=y es: " + compara);
        
        compara = x <= y || x>=y;
        System.out.println("x <= y || x>=y es: " + compara);
        
        compara = x<=y && x >= y || x<y;
        System.out.println("x<=y && x >= y || x<y es: " + compara);
        
        compara = x<=y && x >= y || x>y;
        System.out.println("x<=y && x >= y || x>y es: " + compara);
        
        compara = (x<=y && x >= y) || x>y;
        System.out.println("(x<=y && x >= y) || x>y es: " + compara);
        
        compara = (x<=y) && (x >= y) || (x>y);
        System.out.println("((x<=y) && (x >= y) || (x>y) es: " + compara);
        
        compara = (x<=y && x >= y || x>y);
        System.out.println("(x<=y && x >= y || x>y) es: " + compara);
        
        
        // 1. exponenciales, 
        // 2. logaritmicos, 
        // 3. division, multi, 
        // 4. suma, resta
        int c;
        c = 16 + 20 * 5 / 4;
        System.out.println("16 + 20 * 5 / 4 es: " + c);
        
        c = (16 + 20) * 5 / 4;
        System.out.println("(16 + 20) * 5 / 4 es: " + c);
        
        c = (16 + 20 * 2) * 5 / 4;
        System.out.println("(16 + 20 * 2) * 5 / 4 es: " + c);
        
        compara = x + y + c == 5;
        System.out.println("x + y + c == 5 es: " + compara);
        
        compara = x+y==y && x-y==20 || x>y;
        System.out.println("x+y==16 && x-y==20 || x>y es: " + compara);
        
        compara = 16+x>y && x-y== -20 || x>y;
        System.out.println("x+y==16 && x-y==20 || x>y es: " + compara);
    }
}

public class Manuel {

    public static void main(String[] args) {
        int arreglo[] = { 3, 4, 5, 6 }, total = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            total += arreglo[i];
        }
        
        System.out.println();
        System.out.println(total);
        
        for (int j : arreglo) {
            if (j==3) {
                break;
            }
            
            total += arreglo[j];
        }
        
        System.out.println(total);
    }
}
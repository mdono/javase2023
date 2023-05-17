
public class Manuel {

    public static void main(String[] args) {
        int[] a = new int[4], x;
        int b[] = new int[4], y;
        
        a[0] = 31;
        a[1] = 16;
        a[2] = 20;
        a[3] = 12;
        
        obtenerValor(a, 3);
    }

    private static void obtenerValor(int v[], int p) {
        System.out.println(v[p]);
    }
}
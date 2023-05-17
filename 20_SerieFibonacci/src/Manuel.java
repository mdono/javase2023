
public class Manuel {

    public static void main(String[] args) {
        // 0 1 1 2 3 5
        int actual = 1;
        int anterior = 0;
        int temporal;
        
        while (true) {            
            System.out.println(actual);
            
            temporal = actual;
            actual = actual + anterior;
            anterior = temporal;
            
            if (actual > 100) {
                break;
            }
        }
    }
}
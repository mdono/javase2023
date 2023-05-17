
public class Manuel {

    public static void main(String[] args) {
        String a = "manzana", b = "mar", c = "Mar";
        
        /*
        if (a == b) {
            System.out.println(a + " es igual a " + b);
        } else {
            System.out.println(a + " no es igual a " + b);
        }*/
        
        if (a.equals(b)) {
            System.out.println(a + " es igual a " + b);
        } else {
            System.out.println(a + " no es igual a " + b);
        }
        
        if (!a.equals(b)) {
            System.out.println(a + " no es igual a " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
        
        if (b.equals(c)) {
            System.out.println(b + " es igual a " + c);
        } else {
            System.out.println(b + " no es igual a " + c);
        }
        
        if (b.equalsIgnoreCase(c)) {
            System.out.println(b + " es igual a " + c);
        } else {
            System.out.println(b + " no es igual a " + c);
        }
    }
}
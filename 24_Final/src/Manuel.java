
public class Manuel {

    public static void main(String[] args) {
        Tuna instancia = new Tuna(20);
        
        for (int i = 0; i < 5; i++) {
            instancia.agregar();
            System.out.printf("%s", instancia);
        }
    }
}

public class Manuel {

    public static void main(String[] args) {
        Tuna instancia = new Tuna();
        
        System.out.println(instancia.toMilitar());
        instancia.setTiempo(18, 05, 20);
        System.out.println(instancia.toMilitar());
        instancia.setTiempo(8, 5, 16);
        System.out.println(instancia.toMilitar());
    }
}
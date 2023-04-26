
public class Manuel {

    public static void main(String[] args) {
        Vida instancia = new Vida("Dalsy");
        
        instancia.diciendo();
        instancia.setPrimeraNovia("Fernanda");
        instancia.diciendo();
        //instancia.getPrimeraNovia();
        System.out.println(instancia.getPrimeraNovia());
    }
}
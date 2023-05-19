
import java.util.Arrays;
import java.util.LinkedList;

public class Manuel {

    public static void main(String[] args) {
        String cosas[] = { "Manzanas", "Peras", "Tomate", "Frijol", "Zahahorias" };
        LinkedList<String> laLista = 
                new LinkedList<>(Arrays.asList(cosas));
        
        laLista.add("Rabanos");
        laLista.addFirst("Limones");
        laLista.add(2, "Tortillas");
        
        cosas = laLista.toArray(new String[laLista.size()]);

        for (String s : cosas) {
            System.out.printf("%s\n", s);
        }
    }
}
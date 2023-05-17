
public class Manuel {

    public static void main(String[] args) {
        String cadena = "Estamos en el curso de Java y seguiremos aprendiendo sobre Java, aunque simpre seguiré aprendiendo de Java";
        
        int indice = cadena.indexOf("Java");
        System.out.println(indice);
        
        indice = cadena.indexOf("Java", indice + 1);
        System.out.println(indice);
        
        indice = cadena.lastIndexOf("Java");
        System.out.println(indice);
    }    
}

public class Manuel {

    public static void main(String[] args) {
        /*
        int caso = 5;
        
        switch (caso) {
            case 1:
                System.out.println("Hola Mundo " + caso);
                break;
            case 2:
                System.out.println("Hola Mundo " + caso);
                break;
            default:
                System.out.println("No contamos con el numero " + caso);
        }
        */
        
        char genero = 'x';
        
        switch (genero) {
            case 'f' -> System.out.println("Es el genero femenino");
            case 'm' -> System.out.println("Es el genero masculino");
            default -> System.out.println("Desconozco el genero");
        }
    }
}
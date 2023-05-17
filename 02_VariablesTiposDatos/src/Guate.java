
// VARIABLES: Todo aquello que varia
/*  Es un contenedor de datos que almacena valores durante la 
    ejecución del programa
    REGLAS para crear el nombre de una variable
    debe de iniciar con minúscula
    no se debe de llamar como una palabra reservada
    no tiene que llevar espacios
    no se tiene que usar artículos
    no debe de ser un verbo
    se puede crear con prefijo en referencia el tipo de dato -String stCadena-
    no se puede colocar en el nombre caracteres especiales *.;()¨*&
    no se debe de inicar el nombre con números pero si en el resto del nombre
*/

// CONSTANTES: Todo aquello que no varia

public class Guate {

    String txtCadenaTexto; // Camel
    
    public static void main(String[] args) {
        // cómo se construye una variable
        // tipo + nombre + valor (opcional)
        //variable creada
        int numero;
        //variable inicializada
        numero = 20; // un igual representa SET o asignación
        // una variable puede estar creada
        // variable inicializada
        // tipos de datos
        
        System.out.println(numero);
        numero = 16;
        System.out.println(numero);
        
        String cadenaTexto = "Hola Mundo";
        System.out.println(cadenaTexto);
        double decimal = 16.20;
        System.out.println(decimal);        
        boolean verdad = true;//JIT Just In Time
        //boolean verdad1 = false;
        System.out.println(verdad);
    }
}
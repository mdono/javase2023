
public class Manuel {

    //if(expresion){bloque verdadero}{bloque falso}
    //if(es mayor de edad){puede entrar}{no puede entrar}
    //if(es menor de edad){no puede entrar}{puede entrar}
    public static String analisis(int prueba, int objetivo) {
        String resultado = null;

        /*
        if (prueba == objetivo) {
            resultado = "bloque verdadero";
        } else {
            resultado = "bloque falso";
        }
         */
        
        //primer IF
        if (prueba == objetivo) {
            resultado = "bloque verdadero";
            System.out.println("resultado verdadero 1: " + resultado);
            System.out.println("Hola Mundo");
        } else {
            resultado = "bloque falso";
            System.out.println("resultado falso 1: " + resultado);
        }
        
        //segundo IF
        if (prueba != objetivo) {
            resultado = "bloque verdadero 2";
            System.out.println("resultado verdadero 2: " + resultado);
        } else {
            resultado = "bloque falso 2";
            System.out.println("resultado falso 2: " + resultado);
        }

        return resultado;
    }

    public static String miFuncion(int prueba, int objetivo) {
        String resultado = null;
        
        if (prueba > objetivo) {
            resultado = "bloque verdadero miFuncion";
        } else {
            resultado = "bloque falso miFuncion";
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        //analisis(16, 20);
        //System.out.println(analisis(20, 20));
        System.out.println(miFuncion(16, 4));
    }
}

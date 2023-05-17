
public class Manuel {

    public static void main(String[] args) {
        int primerArreglo[][] = {
            { 8,9,10,11 },
            { 12,13,14,15,16 },
            { 1,2,3 }
        };
        int segundoArreglo[][] = {
            { 20,21,22,23 },
            { 4,5,6 }
        };
        
        System.out.println("Imprimiendo el primer arreglo");
        mostrar(primerArreglo);
        System.out.println("Imprimiendo el segundo arreglo");
        mostrar(segundoArreglo);
    }

    public static void mostrar(int x[][]) {
        for (int filas = 0; filas < x.length; filas++) {
            for (int cols = 0; cols < x[filas].length; cols++) {
                System.out.println(x[filas][cols]);
            }
        }
    }
}
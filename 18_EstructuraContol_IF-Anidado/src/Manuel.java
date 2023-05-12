
public class Manuel {
    
    public static String notas(int valor) {
        String resultado = null;
        
        if (valor >= 9 & valor <= 10) {
            resultado = "A";
        } else if(valor >= 7 & valor <= 8) {
            resultado = "B";
        } else if(valor >= 5 & valor <= 6) {
            resultado = "C";
        } else if(valor >= 3 & valor <= 4) {
            resultado = "D";
        } else {
            resultado = "E";
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(notas(3));
    }    
}
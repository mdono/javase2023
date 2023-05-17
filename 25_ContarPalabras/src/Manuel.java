
public class Manuel {

    public static void main(String[] args) {
        String texto = "palabra o palabra y palabra";
        String textoBuscado = "palabra";
        int contador = 0;
        
        //while (texto.indexOf(textoBuscado) > -1) {
        while (texto.contains(textoBuscado)) {
            texto = texto.substring(
                    texto.indexOf(textoBuscado) + textoBuscado.length(), 
                    texto.length()
            );
            contador++;
        }
        
        System.out.println(contador);
    }
}
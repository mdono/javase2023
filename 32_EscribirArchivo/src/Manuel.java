
public class Manuel {

    public static void main(String[] args) {
        EscribeFile instancia = new EscribeFile();
        
        instancia.abrirArchivo();
        instancia.escribirArchivo();
        instancia.cerrarArchivo();
    }
}
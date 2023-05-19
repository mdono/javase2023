
public class Manuel {

    public static void main(String[] args) {
        LeeFile instancia = new LeeFile();
        
        instancia.abrirArchivo();
        instancia.leerArchivo();
        instancia.cerrarArchivo();
   }
}
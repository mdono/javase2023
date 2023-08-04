
public class Manuel {

    public static void main(String[] args) {
        Conectate instancia = new Conectate();
        
        if (instancia.getConexion() != null) {
            try {
                instancia.desconectar();
                System.out.println("Desconectado correctamente!!!");
            } catch (Exception ex) {
                System.err.println("Err: " + ex.getMessage());
            }
        }
    }
}
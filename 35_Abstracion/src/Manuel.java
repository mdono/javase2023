
public class Manuel {

    public static void main(String[] args) {
        Caracteres instancia = new Caracteres();
        
        System.out.print(instancia.miNombre());
        System.out.print(instancia.miPosicion());
        System.out.println(instancia.miEdad());
        instancia.miPropioMetodo();
    }
}
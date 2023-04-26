
public class Manuel {

    public static void main(String[] args) {
        Sobrecarga instancia = new Sobrecarga("Manuel", 38, "Guatemala");

        System.out.println(instancia.getNombre());
        System.out.println(instancia.getEdad());
        System.out.println(instancia.getDireccion());
        System.out.println();
        
        instancia.sobrecarga(instancia);
        instancia.setNombres("Dalsy");
        instancia.setEdad(32);
        instancia.setDireccion("Chiquimula");
        
        System.out.println(instancia.getNombre());
        System.out.println(instancia.getEdad());
        System.out.println(instancia.getDireccion());
        System.out.println();
        
        instancia.sobrecarga();
    }
}
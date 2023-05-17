
public class Potpie {
    
    private int dia, mes, anio;

    public Potpie(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
        System.out.printf("El valor es: '%s', como retorno de la funcion.\n", this);
    }
    
    @Override
    public String toString() {
        return String.format("La fecha actual es %d/%d/%d", 
                dia, mes, anio);
    }
}
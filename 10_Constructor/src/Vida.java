
public class Vida {
    
    private String primeraNovia;
    
    // constructor
    // se llama igual que la clase
    // no tiene la palabra reservada void
    // un constructor se inicializa cuando se instancia la clase
    public Vida(String primeraNovia) {
        this.primeraNovia = primeraNovia;
    }
    
    // método, tiene la palabra reservada VOID. No retorna valores
    public void diciendo() {
        System.out.println("Tu primera novia fue: " + this.primeraNovia);
    }
    
    // función, tiene la palabra reservada RETURN
    public String miFuncion() {
        return null;
    }
    
    //setters & getters // to
    public String getPrimeraNovia() {
        return primeraNovia;
    }

    public void setPrimeraNovia(String primeraNovia) {
        this.primeraNovia = primeraNovia;
    }
}
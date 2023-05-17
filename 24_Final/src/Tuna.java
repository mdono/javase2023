
public class Tuna {
    
    private int suma;
    private final int NUMERO;

    public Tuna(int n) {
        this.NUMERO = n;
        //this.NUMERO++;
    }
    
    public void agregar() {
        suma += NUMERO;
    }
    
    @Override
    public String toString() {
        return String.format("La suma es %d\n", suma);
    }
}
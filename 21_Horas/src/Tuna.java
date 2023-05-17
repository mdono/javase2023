
public class Tuna {
    private int hora, minutos, segundos;
    
    public void setTiempo(int h, int m, int s) {
        this.hora = (h > 0 & h < 24) ? h : 0;
        this.minutos = (m > 0 & m < 60) ? m : 0;
        this.segundos = (s > 0 & s < 60) ? s : 0;
    }
    
    public String toMilitar() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
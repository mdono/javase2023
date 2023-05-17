
import javax.swing.JOptionPane;

public class Manuel {

    public double fahrenheitCelsius(double grado) {
        double gCelsius = (grado - 32) / 1.8;
        return gCelsius;
        //return (grado - 32) / 1.8;
    }
    
    public double celsiusFahrenheit(double grado) {
        double gFahrenheit = grado * 1.8 + 32;
        return gFahrenheit;
    }
    
    public static void main(String[] args) {
        Manuel instancia = new Manuel();
        int opcion = 0;
        String cadena;
        double grado = 0, celsius, fahrenheit;
        
        do {
            cadena = JOptionPane.
                    showInputDialog("Convertir de:\n[1] - Fahrenheit a Celius\n[2] - Celsius a Fahreheit");
            opcion = Integer.parseInt(cadena);
        } while (opcion < 1 || opcion > 2);
        
        cadena = JOptionPane.showInputDialog("Ingrese temperatura");
        grado = Double.parseDouble(cadena);
        
        switch (opcion) {
            case 1:
                celsius = instancia.fahrenheitCelsius(grado);
                JOptionPane.showMessageDialog(null, celsius + " celsius");
                break;
            case 2:
                fahrenheit = instancia.celsiusFahrenheit(grado);
                JOptionPane.showMessageDialog(null, fahrenheit + " fahrenheit");
                break;
        }
    }
}
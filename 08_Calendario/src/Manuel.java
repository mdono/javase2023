
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Manuel {

    public static void main(String[] args) {
        Date fecha = Calendar.getInstance().getTime();
        
        System.out.println("La fecha actual es: " + fecha);
        System.out.println();
        
        formatFecha();
        agregarFechas();
        diferenciaFechas();
        metodosCalendario();
    }
    
    public static void formatFecha() {
        Calendar fecha = Calendar.getInstance();
        SimpleDateFormat fechaFormato 
                = new SimpleDateFormat(
                        "E dd/MM/yyyy 'a las' hh:mm:ss a zzz");
        
        System.out.println("La fecha actual con formato es: " 
                + fechaFormato.format(fecha.getTime()));
        System.out.println();
    }
    
    public static void agregarFechas(){
        System.out.println("Realiando operaciones con las fecha del calendario");
        
        Calendar fecha = Calendar.getInstance();
        Calendar cldr;
        SimpleDateFormat sdf = 
                new SimpleDateFormat(
                        "E dd/MM/yyyy 'a las' hh:mm:ss a zzz");
        
        //Parser - Cast
        cldr = (Calendar) fecha.clone();
        cldr.add(Calendar.DAY_OF_YEAR, -(365*2));
        
        System.out.println("\tDos años antes era: " 
                + sdf.format(cldr.getTime()));
        
        cldr = (Calendar) fecha.clone();
        cldr.add(Calendar.DAY_OF_YEAR, +5);
        
        System.out.println("\tCinco días después de hoy es: " 
                + sdf.format(cldr.getTime()));
        
        System.out.println();
    }
    
    public static void diferenciaFechas(){
        System.out.println("Diferencias entre fechas");
        Date fechaInicio = 
                new GregorianCalendar(2005, 02, 24, 14, 00).getTime();
        Date fechaFin = new Date();
        
        long diferencia = fechaFin.getTime() - fechaInicio.getTime();
        
        System.out.println("\tDiferencia entre " + fechaFin + " y " 
                + fechaInicio + " ");
        System.out.println("es de " 
                + diferencia / (1000L * 60L * 60L * 24L)
                + " días.");
        System.out.println();
    }
    
    public static void metodosCalendario() {
        System.out.println("Varios métodos de la Clase Calendar");
        Calendar calendario = Calendar.getInstance();
        
        System.out.println("\tAño: " + calendario.get(Calendar.YEAR));
        System.out.println("\tMes (enero inicia con 0): " 
                + calendario.get(Calendar.MONTH));
        System.out.println("\tDía de la semana: (la semana inicia con domingo): " 
                + calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println("\tDía del año: " 
                + calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println("\tSemana del año: " 
                + calendario.get(Calendar.WEEK_OF_YEAR));
        System.out.println("\tSemana del mes: " 
                + calendario.get(Calendar.WEEK_OF_MONTH));
        System.out.println("\tDía de la semana en el mes: " 
                + calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("\tAM PM: " + calendario.get(Calendar.AM_PM));
        System.out.println("\tHora: " + calendario.get(Calendar.HOUR));
        System.out.println("\tMinutos: " + calendario.get(Calendar.MINUTE));
        System.out.println("\tSegundos: " + calendario.get(Calendar.SECOND));
        System.out.println();
    }
}
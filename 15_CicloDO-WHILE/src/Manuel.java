
import javax.swing.JOptionPane;

public class Manuel {

    public static void main(String[] args) {
        //do{cuerpo}while(expresión)
        int x = 10;

        x = x - 1;

        /*
        do {
            //hacer
            System.out.println("valor: " + x);
            //x--;
            --x;
        } while (x > 0);*/
        String texto;
        int opcion;

        do {
            texto = JOptionPane.showInputDialog("opcion 1 o 2");
            opcion = Integer.parseInt(texto);
        } while (opcion < 1 || opcion > 2);

        System.out.println("opcion: " + opcion);
    }
}

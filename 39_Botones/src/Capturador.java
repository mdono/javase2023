
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capturador implements ICaptura, ActionListener {

    Capturador(Gui g) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().substring(0).matches("[0-9]*")) {
            String textoIngresado = e.getActionCommand();
            int numeroIngresado = Integer.parseInt(textoIngresado);
            System.out.println("es numero");
            System.out.println("Operacion " + (numeroIngresado + numeroIngresado));
        } else {
            String signoIngresado = e.getActionCommand();
            System.out.println("es signo");
            System.out.println("Signo: " + signoIngresado);

            if (signoIngresado.equals("=")) {
                System.out.println("Debo de operar");
            }
        }
    }

    @Override
    public void captura() {
        
    }
}
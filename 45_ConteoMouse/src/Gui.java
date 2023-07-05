
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {

    private final JLabel etiqueta;
    private String detalles;
    
    public Gui() {
        super("Conteo del mouse");
        
         etiqueta = new JLabel("DEFAULT");
         add(etiqueta, BorderLayout.SOUTH);
         addMouseListener(new ElManejador());
    }
    
    private class ElManejador extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            detalles = String.format(
                    "Hiciste click %d ", 
                    e.getClickCount()
            );
            
            if (e.isMetaDown()) {
                detalles += "con el derecho";
            } else if(e.isAltDown()) {
                detalles += "con el centro";
            } else {
                detalles += "con la izquierda";
                System.out.println(e);
            }
            
            etiqueta.setText(detalles);
        }
    }
}
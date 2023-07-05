
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    
    public Gui() {
        super("Movimientos del Mouse");
        //setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        add(panel, BorderLayout.CENTER);
        
        etiqueta = new JLabel("DEFAULT");
        add(etiqueta, BorderLayout.SOUTH);
        
        ElManejador instancia = new ElManejador();
        panel.addMouseListener(instancia);
        panel.addMouseMotionListener(instancia);
    }
    
    private class ElManejador implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            etiqueta.setText(
                    String.format(
                            "Ud. hizo click en X:%s y Y:%s", 
                            e.getX(), e.getY()
                    )
            );
        }

        @Override
        public void mousePressed(MouseEvent e) {
            etiqueta.setText("Ud. presionó el mouse");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            etiqueta.setText("Ud. liberó el mouse");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            etiqueta.setText("Ud. ingresó al panel");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            etiqueta.setText("Ud. salió del panel");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            etiqueta.setText("Ud. arrastró el mouse");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            etiqueta.setText("Ud. movió el mouse");
        }
    }
}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui extends JFrame {

    private JButton boton1, boton2;
    private Icon x, y;
    
    public Gui() {
        super("Los Botones");
        setLayout(new FlowLayout());
        
        x = new ImageIcon(getClass().getResource("x.png"));
        y = new ImageIcon(getClass().getResource("y.png"));
        
        boton1 = new JButton("El boton 1");
        add(boton1);
        
        boton2 = new JButton("El boton 2", x);
        boton2.setRolloverIcon(y);
        add(boton2);
        
        ElManejador instancia = new ElManejador();
        boton1.addActionListener(instancia);
        boton2.addActionListener(instancia);
    }
    
    private class ElManejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(
                    null, 
                    String.format("%s", 
                            e.getActionCommand())
            );
        }        
    }
}
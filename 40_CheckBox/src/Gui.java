
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui extends JFrame {
    
    private JTextField tf;
    private JCheckBox boldbox, italicbox;
    
    private class ElManejador implements ItemListener {
        
        private Font fuente;

        public ElManejador(Font fuente) {
            this.fuente = fuente;
        }        

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (boldbox.isSelected() && italicbox.isSelected()) {
                fuente = new Font("Arial", 
                        Font.BOLD + Font.ITALIC, 16);
            } else if(boldbox.isSelected()) {
                fuente = new Font("Arial", Font.BOLD, 16);
            } else if(italicbox.isSelected()) {
                fuente = new Font("Arial", Font.ITALIC, 16);
            }
            
            tf.setFont(fuente);
        }
    }

    public Gui() {
        super("El CheckBox");
        setLayout(new FlowLayout());
        
        tf = new JTextField("Esta es la oración", 26);
        add(tf);
        
        boldbox = new JCheckBox("Negrilla");
        add(boldbox);
        
        italicbox = new JCheckBox("Cursiva");
        add(italicbox);
        
        ElManejador instancia = 
                new ElManejador(
                        new Font("Serif", Font.PLAIN, 20));
        boldbox.addItemListener(instancia);
        italicbox.addItemListener(instancia);
    }    
}

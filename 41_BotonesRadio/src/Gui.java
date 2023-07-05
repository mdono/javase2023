
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//Graphic User Interface
public class Gui extends JFrame {

    private JTextField tf;
    private JRadioButton pb, bb, ib, bib;
    private Font pf, bf, itf, bif;
    private ButtonGroup grupo;
    
    public Gui() {
        super("Botones de radio");
        setLayout(new FlowLayout());
        
        tf = new JTextField("Esta es la oración", 26);
        add(tf);
        
        pb = new JRadioButton("Plano", true);
        bb = new JRadioButton("Negrilla", false);
        ib = new JRadioButton("Cursiva", false);
        bib = new JRadioButton("Negrilla y Cursiva", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        grupo = new ButtonGroup();
        grupo.add(pb);
        grupo.add(bb);
        grupo.add(ib);
        grupo.add(bib);
        
        pf = new Font("Arial", Font.PLAIN, 16);
        bf = new Font("Arial", Font.BOLD, 16);
        itf = new Font("Arial", Font.ITALIC, 16);
        bif = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
        
        //ElManejador instancia = new ElManejador(itf);
        pb.addItemListener(new ElManejador(pf));
        bb.addItemListener(new ElManejador(bf));
        ib.addItemListener(new ElManejador(itf));
        bib.addItemListener(new ElManejador(bif));
    }
    
    private class ElManejador implements ItemListener {
        
        private Font fuente;

        public ElManejador(Font fuente) {
            this.fuente = fuente;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(fuente);
        }
    }
}

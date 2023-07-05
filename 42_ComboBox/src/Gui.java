
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
    
    private JComboBox combo;
    private JLabel etiqueta;
    private static final String ARCHIVO[] = { "x.png", "y.png" };
    private Icon imagenes[] = {
        new ImageIcon(getClass().getResource(ARCHIVO[0])),
        new ImageIcon(getClass().getResource(ARCHIVO[1])),
    };

    public Gui() {
        super("ComboBox");
        setLayout(new FlowLayout());
        
        combo = new JComboBox(ARCHIVO);
        combo.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                etiqueta.setIcon(imagenes[combo.getSelectedIndex()]);
            }
        });
        add(combo);
        
        etiqueta = new JLabel(imagenes[0]);
        add(etiqueta);
    }
}
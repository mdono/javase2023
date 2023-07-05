
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui extends JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu archivo, editar;
    private JMenuItem abrir, copiar;
    
    public Gui() {
        super("Barra de menú");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        
        barra = new JMenuBar();
        archivo = new JMenu("Archivo");
        editar = new JMenu("Editar");
        barra.add(archivo);
        barra.add(editar);
        
        //items del menú
        abrir = new JMenuItem("Abrir");
        copiar = new JMenuItem("Copiar");
        archivo.add(abrir);
        editar.add(copiar);
        
        this.setJMenuBar(barra);
        abrir.addActionListener(this);
        copiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abrir) {
            System.out.println("Abrir");
        } else if (e.getSource() == copiar) {
            System.out.println("Copiar");
        } else {
            System.out.println("Sin informarcion");
        }
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Manuel {
    
    private static ElManejador instancia;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Barra de menú");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        JMenuBar barraMenu = new JMenuBar();
        ventana.setJMenuBar(barraMenu);
        
        JMenu archivo = new JMenu("Archivo");
        barraMenu.add(archivo);
        
        JMenuItem salir = new JMenuItem("Salir");
        archivo.add(salir);
        
        JMenu ayuda = new JMenu("Ayuda");
        barraMenu.add(ayuda);
        
        JMenuItem acerca = new JMenuItem("Acerca");
        ayuda.add(acerca);
        
        instancia = new ElManejador();
        salir.addActionListener(instancia);
    }
    
    private static class ElManejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

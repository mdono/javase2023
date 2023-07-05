
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Manuel extends JFrame implements ActionListener, ItemListener {
    
    private JTextArea area;
    private JScrollPane scroll;
    private String nuevaLinea = "\n";
    private static JPopupMenu popUp;

    public Manuel() {
        //definición de variables
        JMenuBar barra;
        JMenu menu, subMenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
        
        //agregar componentes regulares de la ventana
        Container contenedor = getContentPane();
        area = new JTextArea(5, 30);
        area.setEditable(false);
        scroll = new JScrollPane(area);
        contenedor.add(scroll, BorderLayout.CENTER);
        
        //creamos la barra de menú
        barra = new JMenuBar();
        setJMenuBar(barra);
        
        //creamos el menu
        menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_C);
        menu.getAccessibleContext()
                .setAccessibleDescription(
                        "El único menú en este programa que tiene un item de menú"
                );
        barra.add(menu);
        
        //creamos un submenú
        menu.addSeparator();
        subMenu = new JMenu("Un Submenú");
        subMenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Un item en el submenú");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, 
                ActionEvent.ALT_MASK
        ));
        menuItem.addActionListener(this);
        subMenu.add(menuItem);
        
        menuItem = new JMenuItem("Otro item");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);
        
        menu.add(subMenu);
        
        //creamos un grupo en el JMenuItem
        menuItem = new JMenuItem("Unico texto menuitem", KeyEvent.VK_C);
        menuItem.setAccelerator(KeyStroke
                .getKeyStroke(
                        KeyEvent.VK_1, 
                        ActionEvent.ALT_MASK
                ));
        menuItem.getAccessibleContext()
                .setAccessibleDescription("Este no hace nada");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Ambos textos");
        menuItem.setMnemonic(KeyEvent.VK_B);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Imágenes");
        menuItem.setMnemonic(KeyEvent.VK_G);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        //crear un grupo de radio
        menu.addSeparator();
        ButtonGroup grupo = new ButtonGroup();
        
        rbMenuItem = new JRadioButtonMenuItem("Un radio");
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        grupo.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("Otro radio");
        rbMenuItem.setMnemonic(KeyEvent.VK_T);
        grupo.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        
        //crear un grupo de checkbox
        menu.addSeparator();
        
        cbMenuItem = new JCheckBoxMenuItem("Un checkbox menuitem");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);
        
        cbMenuItem = new JCheckBoxMenuItem("Otro checkbox menuitem");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);
        
        //crear un segundo menu
        menu = new JMenu("Otro Menú");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext()
                .setAccessibleDescription(
                        "Este menu no hace nada"
                );
        barra.add(menu);
        
        //Creamos el Pop up
        popUp = new JPopupMenu();
        menuItem = new JMenuItem("Un popup menuitem");
        menuItem.addActionListener(this);
        popUp.add(menuItem);
        
        menuItem = new JMenuItem("Otro popup menuitem");
        menuItem.addActionListener(this);
        popUp.add(menuItem);
        
        //vamos a agregar el listener
        MouseListener popupListener = new PopupListener();
        area.addMouseListener(popupListener);
        scroll.addMouseListener(popupListener);
        barra.addMouseListener(popupListener);
    }
    
    public static void main(String[] args) {
        Manuel instancia = new Manuel();
        instancia.setTitle("Menú con Popup");
        instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instancia.setSize(450, 260);
        instancia.setVisible(true);
        instancia.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem fuente = (JMenuItem) e.getSource();
        String texto = "Accion detectada "
                + nuevaLinea
                + "evento fuente: "
                + fuente.getText()
                + "(Instancia de "
                + getNombreClase(fuente)
                + ")";
        area.append(texto + nuevaLinea);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JMenuItem fuente = (JMenuItem) e.getSource();
        String texto = "ItemEvent detectado"
                + nuevaLinea
                + "Evento fuente: "                
                + "(Instancia de "
                + nuevaLinea
                + getNombreClase(fuente)
                + ")"
                + nuevaLinea
                + ((e.getStateChange() == ItemEvent.SELECTED)
                ? "Seleccionado"
                : "No seleccionado");
        area.append(texto + nuevaLinea);
    }

    private String getNombreClase(Object objeto) {
        String claseString = objeto.getClass().getName();
        int indice = claseString.lastIndexOf(".");
        
        return claseString.substring(indice + 1);
    }

    private static class PopupListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            quizasMuestrePopup(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            quizasMuestrePopup(e);
        }

        private void quizasMuestrePopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popUp.show(
                        e.getComponent(), 
                        e.getX(), 
                        e.getY()
                );
            }
        }
    }
}
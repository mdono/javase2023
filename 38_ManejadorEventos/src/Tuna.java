
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tuna extends JFrame {

    private JTextField campo1, campo2, campo3;
    private JPasswordField campo4;
    
    public Tuna() {
        super("El titulo");
        setLayout(new FlowLayout());
        
        campo1 = new JTextField(10);
        add(campo1);
        
        campo2 = new JTextField("ingrese texto aqui");
        add(campo2);
        
        campo3 = new JTextField("Ineditable", 20);
        add(campo3);
        
        campo4 = new JPasswordField("mipass");
        add(campo4);
        
        ElManejador instancia = new ElManejador();
        campo1.addActionListener(instancia);
        campo2.addActionListener(instancia);
        campo3.addActionListener(instancia);
        campo4.addActionListener(instancia);
    }
    
    private class ElManejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String texto = null;
            
            if (e.getSource() == campo1) {
                texto = String.format("Campo 1: %s", 
                        e.getActionCommand());
            } else if (e.getSource() == campo2) {
                texto = String.format("Campo 2: %s", 
                        e.getActionCommand());
            } else if (e.getSource() == campo3) {
                texto = String.format("Campo 3: %s", 
                        e.getActionCommand());
            } else if(e.getSource() == campo4) {
                texto = String.format("Campo 4: %s", 
                        e.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, texto);
        }
    }
}
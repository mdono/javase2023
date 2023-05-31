
import javax.swing.JFrame;

public class Manuel {

    public static void main(String[] args) {
        Tuna instancia = new Tuna();
        
        instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instancia.setSize(350, 100);
        instancia.setVisible(true);
        instancia.setLocationRelativeTo(null);
    }
}

import javax.swing.JFrame;

public class Manuel {

    public static void main(String[] args) {
        Gui g = new Gui();
        
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(300, 525);
        g.setVisible(true);
        g.setLocationRelativeTo(null);
    }
}
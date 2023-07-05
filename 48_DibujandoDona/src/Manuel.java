
import javax.swing.JFrame;

public class Manuel extends JFrame {

    public Manuel() {
        add(new Gui());
        setTitle("Dona");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 310);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Manuel();
    }
}

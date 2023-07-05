
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Gui extends JFrame {

    public Gui() {
        super("Figuras");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);
        
        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30);
        
        g.setColor(Color.GREEN);
        g.drawOval(10, 95, 100, 30);
        
        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);
    }
}
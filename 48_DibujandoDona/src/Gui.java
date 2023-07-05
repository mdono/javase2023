
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class Gui extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = 
                new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );
        rh.put(
                RenderingHints.KEY_RENDERING, 
                RenderingHints.VALUE_RENDER_QUALITY
        );
        g2d.setRenderingHints(rh);
        
        Dimension d = getSize();
        double ancho = d.getWidth();
        double alto = d.getHeight();
        
        Ellipse2D elipse = new Ellipse2D.Double(0, 0, 80, 130);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.GRAY);
        
        for (int grado = 0; grado < 360; grado+=10) {
            AffineTransform at = 
                    AffineTransform
                            .getTranslateInstance(
                                    ancho / 2, 
                                    alto / 2
                            );
            at.rotate(Math.toRadians(grado));
            g2d.draw(at.createTransformedShape(elipse));
        }
    }
}
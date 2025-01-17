package nl.mpdev;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawningCanvas  extends JComponent {
  private int width;
  private int height;

  public DrawningCanvas(int width, int height) {
    this.width = width;
    this.height = height;
  }

  protected void paintComponent(Graphics g) {
    // casten from Graphics to Graphics2D
    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D.Double r = new Rectangle2D.Double(0,0 ,width,height);
    g2d.setColor(new Color(100,149,237));
    g2d.fill(r);

    Ellipse2D.Double e = new Ellipse2D.Double(10,10 ,20,20);
    g2d.setColor(Color.RED);
    g2d.fill(e);

  }
}

package nl.mpdev;

import javax.swing.*;
import java.awt.*;

public class DrawningCanvas extends JComponent {
  private int width;
  private int height;
  private Cloud c1;
  private Cloud c2;
  private Cloud c3;

  public DrawningCanvas(int width, int height) {
    this.width = width;
    this.height = height;
    c1 = new Cloud(10,50,75,Color.LIGHT_GRAY);
    c2 = new Cloud(200,75,90,Color.BLUE);
    c3 = new Cloud(420,60,85,Color.DARK_GRAY);

  }

  @Override
  protected void paintComponent(Graphics g) {
    // casten from Graphics to Graphics2D
    Graphics2D g2d = (Graphics2D) g;

    RenderingHints rh = new RenderingHints(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON
    );
    g2d.setRenderingHints(rh);

    c1.drawCloud(g2d);
    c2.drawCloud(g2d);
    c3.drawCloud(g2d);
//    Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
//    g2d.setColor(new Color(100, 149, 237));
//    g2d.fill(r);
//
//    Line2D.Double l = new Line2D.Double(100, 250, 300, 75);
//    g2d.setColor(Color.BLACK);
//    // For lines we used draw
//    g2d.draw(l);
//
//    Ellipse2D.Double e = new Ellipse2D.Double(200, 75, 100, 100);
//    g2d.setColor(Color.RED);
//    g2d.fill(e);



  }
}

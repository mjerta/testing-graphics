package nl.mpdev;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cloud {

  public Cloud() {
  }

  public void drawCloud(Graphics2D g2d) {
    Ellipse2D.Double e1 = new Ellipse2D.Double(200,75,100,100);
    Ellipse2D.Double e2 = new Ellipse2D.Double(235, 55, 175, 140);
    Ellipse2D.Double e3 = new Ellipse2D.Double(350,90,90,90);
    Ellipse2D.Double e4 = new Ellipse2D.Double(380,80,30,30);
    g2d.setColor(Color.BLUE);
    g2d.fill(e1);
    g2d.fill(e2);
    g2d.fill(e3);
    g2d.fill(e4);
  }
}

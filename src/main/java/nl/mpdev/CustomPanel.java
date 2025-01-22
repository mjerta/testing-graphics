package nl.mpdev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class CustomPanel extends JPanel {
  private final int width;
  private final int height;
  private final int cellSize;
  private int x = 0;
  private int y = 0;
  private Timer timer;

  public CustomPanel(int width, int height, int cellSize) {
    this.width = width;
    this.height = height;
    this.cellSize = cellSize;
//    timer = new Timer(200,this);
//    timer.start();

    new Thread(() -> {
      for(int i = 0;i < 20; i++) {
        x += 20;
        repaint();
        try {
          Thread.sleep(100);
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      }
    }).start();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // cast from Graphics to Graphics2D
    Graphics2D g2d = (Graphics2D) g;
    RenderingHints rh = new RenderingHints(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON
    );
    g2d.setRenderingHints(rh);

    // create grid
    Path2D.Double path = new Path2D.Double();
    for(int x = 0; x <= width; x += cellSize) {
      path.moveTo(x,0);
      path.lineTo(x,height);
      g2d.draw(path);
    }
    for(int y = 0; y <=height; y += cellSize) {
      path.moveTo(0,y);
      path.lineTo(width, y);
      g2d.draw(path);
    }
    Rectangle2D.Double r = new Rectangle2D.Double(this.x,this.y,20,20);
    g2d.fill(r);
  }

//  @Override
//  public void actionPerformed(ActionEvent e) {
//    x += 20;
//    repaint();
//  }
}

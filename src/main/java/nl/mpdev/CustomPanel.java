package nl.mpdev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.time.Year;
import java.util.Random;

public class CustomPanel extends JPanel implements ActionListener, KeyListener {
  private final int width;
  private final int height;
  private final int cellSize;
  private final int xVelocity;
  private final int yVelocity;
  private int x = 0;
  private int y = 0;
  private Direction direction;
  private Color rectColor;
  private final Random random;

  public CustomPanel(int width, int height, int cellSize) {
    this.width = width;
    this.height = height;
    this.setPreferredSize(new Dimension(width,height));
    this.cellSize = cellSize;
    this.xVelocity = cellSize;
    this.yVelocity = cellSize;
    this.direction = Direction.RIGHT;
    this.rectColor = Color.RED; // Initial color
    this.random = new Random();
    this.addKeyListener(this);
    this.setFocusable(true);
    this.requestFocusInWindow();
    Timer timer = new Timer(100, this);
    timer.start();
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
    for (int x = 0; x <= width; x += cellSize) {
      path.moveTo(x, 0);
      path.lineTo(x, height);
      g2d.draw(path);
    }
    for (int y = 0; y <= height; y += cellSize) {
      path.moveTo(0, y);
      path.lineTo(width, y);
      g2d.draw(path);
    }
    Rectangle2D.Double r = new Rectangle2D.Double(this.x, this.y, 20, 20);
    g2d.setColor(rectColor);
    g2d.fill(r);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch (direction) {
      case RIGHT:
        if (x == width - cellSize) {
          direction = Direction.DOWN;
          break;
        }
        x = x + xVelocity;
        break;
      case DOWN:
        if (y == height - cellSize) {
          direction = Direction.LEFT;
          break;
        }
        y = y + yVelocity;
        break;
      case LEFT:
        if (x == 0) {
          direction = Direction.UP;
          break;
        }
        x = x - xVelocity;
        break;
      case UP:
        if (y == 0) {
          direction = Direction.RIGHT;
          break;
        }
        y = y - yVelocity;
        break;
    }
    rectColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    repaint();
  }

  @Override
  public void keyTyped(KeyEvent e) {


  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("You released key character " + e.getKeyChar());
  }
}

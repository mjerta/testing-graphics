package nl.mpdev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomFrame extends JFrame implements KeyListener {

  private final JLabel label;

  public CustomFrame(String title, CustomPanel customPanel) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle(title);
    this.setLayout(null);
//    this.add(customPanel);
    this.setPreferredSize(new Dimension(500, 500));
    this.pack();
    this.setLocationRelativeTo(null);
    this.addKeyListener(this);

    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setBackground(Color.RED);
    label.setOpaque(true);
    this.add(label);
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {

    switch (e.getKeyChar()) {
      case 'a':
        label.setLocation(label.getX() - 1, label.getY());

    }
  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("Key Released: Code=" + e.getKeyCode() + ", Char=" + e.getKeyChar());
  }
}

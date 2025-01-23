package nl.mpdev;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomFrame extends JFrame implements KeyListener {

  public CustomFrame(String title, CustomPanel customPanel) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle(title);
    this.setLayout(null);
//    this.add(customPanel);
    this.addKeyListener(this);
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("Key code is being pressed: " + e.getKeyCode());

  }

  @Override
  public void keyReleased(KeyEvent e) {
//    System.out.println("Key Released: Code=" + e.getKeyCode() + ", Char=" + e.getKeyChar());
  }
}

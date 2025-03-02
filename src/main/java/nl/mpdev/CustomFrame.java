package nl.mpdev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomFrame extends JFrame {

//  private final JLabel label;
//  private int velocity = 10;

  public CustomFrame(String title, CustomPanel customPanel) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle(title);
//    this.setLayout(null);
    this.add(customPanel);
//    this.setPreferredSize(new Dimension(500, 500));
    this.pack();
//    this.setLocationRelativeTo(null);
//    this.addKeyListener(this);
//
//    label = new JLabel();
//    label.setBounds(0, 0, 100, 100);
//    label.setBackground(Color.RED);
//    label.setOpaque(true);
//    this.add(label);
    this.setVisible(true);
  }

//  @Override
//  public void keyTyped(KeyEvent e) {
//
//    switch (e.getKeyChar()) {
//      case 'a':
//        label.setLocation(label.getX() - velocity, label.getY());
//        break;
//      case 'w':
//        label.setLocation(label.getX(), label.getY() - velocity);
//        break;
//      case 's':
//        label.setLocation(label.getX(), label.getY() + velocity);
//        break;
//      case 'd':
//        label.setLocation(label.getX() + velocity, label.getY());
//        break;
//      default:
//        System.out.println("Unhandled key char: " + e.getKeyChar());
//        break;
//    }
//  }
//
//  @Override
//  public void keyPressed(KeyEvent e) {
//
//    switch (e.getKeyCode()){
//      case 37:
//        label.setLocation(label.getX() -velocity, label.getY());
//        break;
//      case 38:
//        label.setLocation(label.getX(), label.getY() - velocity);
//        break;
//      case 39:
//        label.setLocation(label.getX() + velocity, label.getY());
//        break;
//      case 40:
//        label.setLocation(label.getX(),label.getY() + velocity);
//      default:
//        System.out.println("Unhandled key code: " + e.getKeyCode());
//        break;
//    }
//  }

//  @Override
//  public void keyReleased(KeyEvent e) {
//    System.out.println("Key Released: Code=" + e.getKeyCode() + ", Char=" + e.getKeyChar());
//  }
}

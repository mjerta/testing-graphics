package nl.mpdev;

import javax.swing.*;

public class App {
  public static void main(String[] args) {
    int w = 640;
    int h = 480;
    JFrame f = new JFrame();
    f.setSize(w, h);
    f.setTitle("Drawning in Java");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}

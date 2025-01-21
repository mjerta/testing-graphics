package nl.mpdev;

import javax.swing.*;

public class App {
  public static void main(String[] args) {
    int w = 640;
    int h = 480;
    int c = 20;
    JFrame f = new JFrame();
    f.add(new DrawningCanvas(w, h, c));
    f.setSize(w, h);
    f.setTitle("Drawning in Java");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}

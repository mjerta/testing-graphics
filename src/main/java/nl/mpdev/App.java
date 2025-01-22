package nl.mpdev;

import javax.swing.*;
import java.awt.*;

public class App {
  public static void main(String[] args) {
    int w = 640;
    int h = 480;
    int c = 20;
    JFrame f = new JFrame();
    CustomPanel customPanel = new CustomPanel(w, h, c);
    customPanel.setPreferredSize(new Dimension(w,h));
    f.add(customPanel);
    f.pack();
    f.setTitle("Drawning in Java");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}

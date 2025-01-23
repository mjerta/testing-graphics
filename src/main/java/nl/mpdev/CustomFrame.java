package nl.mpdev;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

  public CustomFrame(String title, CustomPanel customPanel) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setTitle(title);
    this.setLayout(null);
    this.add(customPanel);
    this.pack();
  }
}

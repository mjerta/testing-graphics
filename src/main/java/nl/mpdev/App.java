package nl.mpdev;

import javax.swing.*;

public class App {
  public static void main(String[] args) {

    JFrame f = new CustomFrame("Drawning in java", new CustomPanel(640,480,20));
  }
}

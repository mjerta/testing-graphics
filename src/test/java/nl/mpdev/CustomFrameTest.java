package nl.mpdev;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomFrameTest {

  private CustomFrame customFrame;
  private JLabel label;
  private final int velocity = 10;


  @BeforeEach
  public void setUp() {
    CustomPanel customPanel = new CustomPanel(500, 500, 20);
    customFrame = new CustomFrame("Test Frame", customPanel);
    label = (JLabel) customFrame.getContentPane().getComponent(0);
  }

  @Test
  public void testKeyPressed_LeftArrow() {
    // Arrange
    int initialX = label.getX();
    KeyEvent leftArrowEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, KeyEvent.CHAR_UNDEFINED);

    // Act
    customFrame.keyPressed(leftArrowEvent);

    // Assert
    assertEquals(initialX - velocity, label.getX());
  }

  @Test
  public void testKeyPressed_UpArrow() {
    // Arrange
    int initialY = label.getY();
    KeyEvent upArrowEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, KeyEvent.CHAR_UNDEFINED);

    // Act
    customFrame.keyPressed(upArrowEvent);

    // Assert
    assertEquals(initialY - velocity, label.getY());
  }

  @Test
  public void testKeyPressed_RightArrow() {
    // Arrange
    int initialX = label.getX();
    KeyEvent rightArrowEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, KeyEvent.CHAR_UNDEFINED);

    // Act
    customFrame.keyPressed(rightArrowEvent);

    // Assert
    assertEquals(initialX + velocity, label.getX());
  }

  @Test
  public void testKeyPressed_DownArrow() {
    // Arrange
    int initialY = label.getY();
    KeyEvent downArrowEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, KeyEvent.CHAR_UNDEFINED);

    // Act
    customFrame.keyPressed(downArrowEvent);

    // Assert
    assertEquals(initialY + velocity, label.getY());
  }
}
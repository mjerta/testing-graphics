package nl.mpdev;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomFrameTest {

  private CustomFrame customFrame;
  private JLabel label;
  private final int velocity = 10;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUp() {
    CustomPanel customPanel = new CustomPanel(500, 500, 20);
    customFrame = new CustomFrame("Test Frame", customPanel);
    label = (JLabel) customFrame.getContentPane().getComponent(0);
    System.setOut(new PrintStream(outContent));
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

  @Test
  public void testKeyPressed_A() {
    // Arrange
    int initialX = label.getX();
    KeyEvent aKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(),0, KeyEvent.VK_UNDEFINED, 'a');

    // Act
    customFrame.keyTyped(aKeyEvent);

    // Assert
    assertEquals(initialX - velocity, label.getX());

  }
  @Test
  public void testKeyTyped_W() {
    // Arrange
    int initialY = label.getY();
    KeyEvent wKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 'w');

    // Act
    customFrame.keyTyped(wKeyEvent);

    // Assert
    assertEquals(initialY - velocity, label.getY());
  }

  @Test
  public void testKeyTyped_S() {
    // Arrange
    int initialY = label.getY();
    KeyEvent sKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 's');

    // Act
    customFrame.keyTyped(sKeyEvent);

    // Assert
    assertEquals(initialY + velocity, label.getY());
  }

  @Test
  public void testKeyTyped_D() {
    // Arrange
    int initialX = label.getX();
    KeyEvent dKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 'd');

    // Act
    customFrame.keyTyped(dKeyEvent);

    // Assert
    assertEquals(initialX + velocity, label.getX());
  }

  @Test
  public void testKeyPressed_DefaultCase() {
    // Arrange
    KeyEvent unhandledKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_F1, KeyEvent.CHAR_UNDEFINED);

    // Act
    customFrame.keyPressed(unhandledKeyEvent);

    // Assert
    assertEquals("Unhandled key code: 112" + System.lineSeparator(), outContent.toString());
  }

  @Test
  public void testKeyTypedPressed_DefaultCase() {
    // Arrange
    KeyEvent unhandledKeyEvent = new KeyEvent(customFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UNDEFINED, 'k');

    // Act
    customFrame.keyTyped(unhandledKeyEvent);

    // Assert
    assertEquals("Unhandled key char: k" + System.lineSeparator(), outContent.toString());
  }
}
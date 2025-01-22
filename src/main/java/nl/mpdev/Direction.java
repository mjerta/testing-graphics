package nl.mpdev;

public enum Direction {
  UP,
  DOWN,
  LEFT,
  RIGHT;


  public Direction next() {
    return values()[(ordinal() + 1) % values().length];
  }
}

package pawelwlk.metabolic;

public enum ActivityLevel {
  NONE(1.2),
  SMALL(1.4),
  MEDIUM(1.6),
  HIGH(1.8),
  VERY_HIGH(2.2);

  public double value;

  ActivityLevel(double value) {
    this.value = value;
  }
}

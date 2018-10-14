package pawelwlk.metabolic;

/**
 * enum defining human daily activity levels
 */
public enum ActivityLevel {
  NONE(1.2),
  SMALL(1.4),
  MEDIUM(1.6),
  HIGH(1.8),
  VERY_HIGH(2.2);

  /**
   * value used to calculate tmr based on activity
   */
  public double value;

  /**
   * basic constructor
   * @param value value used to calculate tmr based on activity
   */
  ActivityLevel(final double value) {
    this.value = value;
  }
}

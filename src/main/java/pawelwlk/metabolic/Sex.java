package pawelwlk.metabolic;

/**
 * enum for human sexes with information needed to calculate bmr
 */
public enum Sex {
  MALE(5), FEMALE(-161);

  /**
   * value needed to calculate bmr
   */
  public int value;

  /**
   * basic constructor
   * @param val value needed to calculate bmr
   */
  Sex(final int val) {
    value = val;
  }
}

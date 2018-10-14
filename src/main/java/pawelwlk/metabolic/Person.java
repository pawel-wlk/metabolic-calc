package pawelwlk.metabolic;

/**
 * class representing person whose metabolic data is being calculated
 */
class Person {
  /**
   * height
   */
  private double height;
  /**
   * weight
   */
  private double weight;
  /**
   * age
   */
  private int age;
  /**
   * sex
   */
  private Sex sex;
  /**
   * activity level
   */
  private ActivityLevel activity;

  /**
   * constructor used for bmi calculations
   * @param height person's height
   * @param weight person's weight
   */
  Person(final double height, final double weight) {
    this.height = height;
    this.weight = weight;
  }

  /**
   * constructor with complete data
   * @param height person's height
   * @param weight person's weight
   * @param age person's age
   * @param sex person's sex
   * @param activity person's activity level
   */
  Person(final double height, final double weight, final int age, final Sex sex, final ActivityLevel activity) {
    this.height = height;
    this.weight = weight;
    this.age = age;
    this.sex = sex;
    this.activity = activity;
  }

  /**
   *
   * @return body mass index
   */
  double calculateBMI(){
    return weight / (height*height);
  }

  /**
   *
   * @return basic metabolic rate
   */
  double calculateBMR(){
    return 9.99*weight + 625*height + 4.92*age + this.sex.value;
  }

  /**
   *
   * @return total metabolic rate
   */
  double calculateTMR(){
    return activity.value * calculateBMR();
  }
}

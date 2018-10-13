package pawelwlk.metabolic;

public class Person {
  private double height;
  private double weight;
  private int age;
  public Sex sex;
  public ActivityLevel activity;

  public Person(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }
  public Person(double height, double weight, int age, Sex sex, ActivityLevel activity) {
    this.height = height;
    this.weight = weight;
    this.age = age;
    this.sex = sex;
    this.activity = activity;
  }

  public double BMI(){
    return weight / (height*height);
  }
  public double BMR(){
    if (this.sex == Sex.MALE) {
      return 9.99*weight + 6.25*height + 4.92*age + 5;
    }
    else {
      return 9.99*weight + 6.25*height + 4.92*age - 161;
    }
  }
  public double TMR(){
    switch(activity) {
      case NONE:
        return 1.2*BMR();
      case SMALL:
        return 1.4*BMR();
      case MEDIUM:
        return 1.6*BMR();
      case HIGH:
        return 1.8*BMR();
      case VERY_HIGH:
        return 2.2*BMR();
      default:
        return 0;
    }
  }
}

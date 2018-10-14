package pawelwlk.metabolic;

public class Person {
  private double height;
  private double weight;
  private int age;
  private Sex sex;
  private ActivityLevel activity;

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
    return 9.99*weight + 625*height + 4.92*age + this.sex.value;
  }
  public double TMR(){
    return activity.value * BMR();
  }
}

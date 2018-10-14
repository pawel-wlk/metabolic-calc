package pawelwlk.metabolic;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
  /**
   * person whose data is being calculated
   */
  private Person currentPerson;

  @FXML private TextField weightField;
  @FXML private TextField heightField;
  @FXML private TextField ageField;
  @FXML private ComboBox<Sex> sexField;
  @FXML private ComboBox<ActivityLevel> activityField;

  @FXML private Label bmiLabel;
  @FXML private Label bmrLabel;
  @FXML private Label tmrLabel;

  @FXML private Label exceptionLabel;

  /**
   * initialize application
   * especially set combobox values
   */
  public void initialize() {
    sexField.getItems().addAll(Sex.values());
    activityField.getItems().addAll(ActivityLevel.values());
  }

  /**
   * show body mass index to user
   */
  public void calculateBMI() {
    exceptionLabel.setText("");
    try{
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()));
      this.bmiLabel.setText(String.valueOf(currentPerson.calculateBMI()).substring(0,5));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

  /**
   * shot basic metabolic rate to user
   */
  public void calculateBMR() {
    exceptionLabel.setText("");
    try{
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()), Integer.parseInt(ageField.getText()), sexField.getValue(), activityField.getValue());
      this.bmrLabel.setText(String.valueOf(currentPerson.calculateBMR()));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

  /**
   * show total metabolic rate to user
   */
  public void calculateTMR() {
    exceptionLabel.setText("");
    try {
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()), Integer.parseInt(ageField.getText()), sexField.getValue(), activityField.getValue());
      this.tmrLabel.setText(String.valueOf(currentPerson.calculateTMR()));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

}

package pawelwlk.metabolic;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
  private static final Logger log = LoggerFactory.getLogger(Controller.class);

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

  public void initialize() {
    sexField.getItems().addAll(Sex.values());
    activityField.getItems().addAll(ActivityLevel.values());
  }


  public void calculateBMI() {
    exceptionLabel.setText("");
    try{
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()));
      this.bmiLabel.setText(String.valueOf(currentPerson.BMI()).substring(0,5));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

  public void calculateBMR() {
    exceptionLabel.setText("");
    try{
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()), Integer.parseInt(ageField.getText()), sexField.getValue(), activityField.getValue());
      this.bmrLabel.setText(String.valueOf(currentPerson.BMR()));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

  public void calculateTMR() {
    exceptionLabel.setText("");
    try {
      currentPerson = new Person(Double.parseDouble(heightField.getText()), Double.parseDouble(weightField.getText()), Integer.parseInt(ageField.getText()), sexField.getValue(), activityField.getValue());
      this.tmrLabel.setText(String.valueOf(currentPerson.TMR()));
    }
    catch (Exception e) {
      exceptionLabel.setText("wrong data");
    }
  }

}

package pawelwlk.metabolic;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @FXML private TextField weightField;
    @FXML private TextField heightField;
    @FXML private TextField ageField;
    @FXML private TextField sexField;
    @FXML private TextField activityField;
    @FXML private Label messageLabel;

    public void sayHello() {
    }

}

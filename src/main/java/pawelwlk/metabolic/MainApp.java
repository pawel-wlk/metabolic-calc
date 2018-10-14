package pawelwlk.metabolic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * main appication class for more check out javafx documentation
 */
public class MainApp extends Application {

  public static void main(final String[] args) throws Exception {
    launch(args);
  }

  public void start(final Stage stage) throws Exception {
    final String fxmlFile = "/fxml/hello.fxml";

    final FXMLLoader loader = new FXMLLoader();
    final Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

    final Scene scene = new Scene(rootNode, 600, 400);
    scene.getStylesheets().add("/styles/styles.css");

    stage.setTitle("Metabolic Calculator");
    stage.setScene(scene);
    stage.show();
  }
}

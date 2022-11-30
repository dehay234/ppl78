package Visual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VisualApplication extends Application {


    public void window(){
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("SceneBuild.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setTitle("Gaming_Room");
        stage.setScene(scene);
        stage.show();
    }
}

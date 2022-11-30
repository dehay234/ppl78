package Visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene2Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField searchTextField;
    @FXML
    private Button searchButton;

    public void switchtoScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneBuild.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoFlowerSearch(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("SearchFlower.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoAccessorySearch(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("SceneSearchAccessory.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}

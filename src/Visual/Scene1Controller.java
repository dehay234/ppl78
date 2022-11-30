package Visual;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane scenePane;

    public void switchtoScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    public void bouquet(ActionEvent event ) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneBouquet.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent e ){
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
}

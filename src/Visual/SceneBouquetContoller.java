package Visual;

import BouquetParts.Accessory;
import BouquetParts.Flower;
import Data.ItemsInfo;
import MainBouquet.Bouquet;
import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class SceneBouquetContoller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button deleteFlowerButton;
    @FXML
    private Button deleteAccessoryButton;
    @FXML
    private ListView<String>  flowerListView;
    @FXML
    private Button sortButton;
    @FXML
    private Button buyButton;

    @FXML
    private Label resultLabel;

    private String selectedFlowerString;
    private Flower selectedFlower;

    private String selectedAccessoryString;
    private Accessory selectedAccessory;
    @FXML
    private ListView<String>  accessoriesListView;
    public void showFlowers(ActionEvent e){

        updateFlowers();
        showAccessories(e);
        sortButton.setDisable(false);
        buyButton.setDisable(false);

    }
    public void updateFlowers(){
        ArrayList<String> flowers= Bouquet.showFlowers();
        if(flowers.size()==0)
            flowerListView.getItems().setAll("No matching results");
        else {
            flowerListView.getItems().setAll(flowers);
            flowerListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    selectedFlowerString =  flowerListView.getSelectionModel().getSelectedItem();
                    ArrayList<Flower> flowers1= ItemsInfo.getAllFlowers1();

                    for (Flower flower: flowers1) {
                        if (Objects.equals(flower.toString(), selectedFlowerString)) {
                            selectedFlower = flower;
                            break;
                        }
                    }
                    deleteFlowerButton.setDisable(false);
                }
            });
        }

    }
    public void showAccessories(ActionEvent e){
        updateAccessories();
    }
    public void updateAccessories(){
        ArrayList<String> accessories= Bouquet.showAccessories();
        if(accessories.size()==0)
            accessoriesListView.getItems().setAll("No matching results");
        else {
            accessoriesListView.getItems().setAll(accessories);
            accessoriesListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    selectedAccessoryString =  accessoriesListView.getSelectionModel().getSelectedItem();
                    ArrayList<Accessory> accessories1= ItemsInfo.getAllAccessories1();

                    for (Accessory accessory: accessories1) {
                        if (Objects.equals(accessory.toString(), selectedAccessoryString)) {
                            selectedAccessory = accessory;
                            break;
                        }
                    }
                    deleteAccessoryButton.setDisable(false);
                }
            });
        }
    }

    public void sort(ActionEvent e){

        new Bouquet().sort();
        updateFlowers();
    }

    public void buyBouquet(ActionEvent event){
        resultLabel.setText("Bouquet costs: "+Bouquet.getPrice()+". Program ends in 5 seconds");
        stage = (Stage) resultLabel.getScene().getWindow();
        PauseTransition visiblePause = new PauseTransition(
                Duration.seconds(5)
        );
        visiblePause.setOnFinished(
                e -> stage.close()
        );

        visiblePause.play();

    }

    public void deleteFlower(ActionEvent e){
        Bouquet.deleteFlowerForVisual(selectedFlower);
        updateFlowers();
        deleteFlowerButton.setDisable(true);
    }

    public void deleteAccessory(ActionEvent e){
        Bouquet.deleteAccessoryForVisual(selectedAccessory);
        updateAccessories();
        deleteAccessoryButton.setDisable(true);
    }

    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SceneBuild.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }



}

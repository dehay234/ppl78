package Visual;

import BouquetParts.Accessory;
import Data.DataSearchForVisualProgram;
import Data.ItemsInfo;
import MainBouquet.Bouquet;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class SceneSearchAccessoryController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private CheckBox varietyCheckBox;

    @FXML
    private CheckBox priceCheckBox;
    @FXML
    private TextField textField;
    @FXML
    private Button searchButton;
    @FXML
    private Label errorSearchLabel;
    @FXML
    private ListView<String> listView;
    @FXML
    private Button addButton;
    @FXML
    private Button backButton;
    ArrayList<String> accessories =new ArrayList<String>();
    int value;
    String variety;
    String selectedAccessoryString;
    Accessory selectedAccessory;

    public void submit(ActionEvent event){
        accessories =new ArrayList<String>();
        ArrayList<Integer> arr;
        ArrayList<Accessory> accessories1= ItemsInfo.getAllAccessories1();

        if(varietyCheckBox.isSelected()) {
            variety = textField.getText();

            arr = DataSearchForVisualProgram.searchAccByVariety(variety);
            for(int i: arr)
                accessories.add(accessories1.get(i).toString());

            updateView();

        }

        else {
            try{
                value = Integer.parseInt(textField.getText());
                errorSearchLabel.setText("");

                arr = DataSearchForVisualProgram.searchAccByPrice(value);

                for(int i: arr)
                    accessories.add(accessories1.get(i).toString());
                updateView();


            }
            catch (NumberFormatException e){
                errorSearchLabel.setText("You have to enter number!");
            }

        }

    }

    public void selectVarietyMethod(ActionEvent event){

        if(varietyCheckBox.isSelected()){

            priceCheckBox.setSelected(false);

            textField.setVisible(true);
            searchButton.setVisible(true);

        }

        else{
            textField.setVisible(false);
            searchButton.setVisible(false);
        }


    }


    public void selectPriceMethod(ActionEvent event){

        if(priceCheckBox.isSelected()){

            varietyCheckBox.setSelected(false);

            textField.setVisible(true);
            searchButton.setVisible(true);
        }

        else{
            textField.setVisible(false);
            searchButton.setVisible(false);
        }


    }


    public void updateView(){
        if(accessories.size()==0)
            listView.getItems().setAll("No matching results");
        else {

            listView.getItems().setAll(accessories);
            listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    selectedAccessoryString = listView.getSelectionModel().getSelectedItem();
                    ArrayList<Accessory> accessories1= ItemsInfo.getAllAccessories1();

                    for (Accessory accessory: accessories1 ) {
                        if (Objects.equals(accessory.toString(), selectedAccessoryString)) {
                            selectedAccessory = accessory;
                            break;
                        }
                    }
                    addButton.setVisible(true);
                }
            });

        }

    }

    public void addToBouquet(ActionEvent event){

        Bouquet.addAccessory(selectedAccessory);
    }
    public void back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}

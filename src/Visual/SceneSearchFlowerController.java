package Visual;

import BouquetParts.Flower;
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

public class SceneSearchFlowerController  {

    private Stage stage;
    private Scene scene;
    private Parent root;
@FXML
    private CheckBox varietyCheckBox;

@FXML
    private CheckBox freshnessCheckBox;
@FXML
    private CheckBox priceCheckBox;
@FXML
    private CheckBox lengthCheckBox;

@FXML
    private TextField searchTextField;
@FXML
    private Button searchButton;
@FXML
    private Label errorSearchLabel;
@FXML
    private ListView<String> flowerListView;
@FXML
    private Button addButton;

    ArrayList<String> flowers=new ArrayList<String>();
    int value;
    String variety;
    String selectedFlowerString;
    Flower selectedFlower;

public void submit(ActionEvent event){
    flowers=new ArrayList<String>();
    ArrayList<Integer> arr;
    ArrayList<Flower> flowers1= ItemsInfo.getAllFlowers1();

    if(varietyCheckBox.isSelected()) {
        variety = searchTextField.getText();

        arr = DataSearchForVisualProgram.searchFlowByVariety(variety);
        for(int i: arr)
            flowers.add(flowers1.get(i).toString());

        updateView();

    }

    else {
        try{
            value = Integer.parseInt(searchTextField.getText());
            errorSearchLabel.setText("");

            if(freshnessCheckBox.isSelected())
                arr = DataSearchForVisualProgram.searchFlowByFreshness(value);
            else if(lengthCheckBox.isSelected())
                arr = DataSearchForVisualProgram.searchFlowByLength(value);
            else
                arr = DataSearchForVisualProgram.searchFlowByPrice(value);

            for(int i: arr)
                flowers.add(flowers1.get(i).toString());
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
        lengthCheckBox.setSelected(false);
        freshnessCheckBox.setSelected(false);

        searchTextField.setVisible(true);
        searchButton.setVisible(true);

    }

    else{
        searchTextField.setVisible(false);
        searchButton.setVisible(false);
    }


}
public void selectLengthMethod(ActionEvent event){

        if(lengthCheckBox.isSelected()){

            priceCheckBox.setSelected(false);
            varietyCheckBox.setSelected(false);
            freshnessCheckBox.setSelected(false);

            searchTextField.setVisible(true);
            searchButton.setVisible(true);

        }

        else{
            searchTextField.setVisible(false);
            searchButton.setVisible(false);
        }


}

public void selectPriceMethod(ActionEvent event){

        if(priceCheckBox.isSelected()){

            varietyCheckBox.setSelected(false);
            lengthCheckBox.setSelected(false);
            freshnessCheckBox.setSelected(false);

            searchTextField.setVisible(true);
            searchButton.setVisible(true);

        }

        else{
            searchTextField.setVisible(false);
            searchButton.setVisible(false);
        }


}

public void selectFreshnessMethod(ActionEvent event){

        if(freshnessCheckBox.isSelected()){

            priceCheckBox.setSelected(false);
            lengthCheckBox.setSelected(false);
            varietyCheckBox.setSelected(false);

            searchTextField.setVisible(true);
            searchButton.setVisible(true);

        }

        else{
            searchTextField.setVisible(false);
            searchButton.setVisible(false);
        }

}
public void updateView(){
    if(flowers.size()==0)
        flowerListView.getItems().setAll("No matching results");
    else {

        flowerListView.getItems().setAll(flowers);
        flowerListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedFlowerString = flowerListView.getSelectionModel().getSelectedItem();
                ArrayList<Flower> flowers1= ItemsInfo.getAllFlowers1();

                for (Flower flower: flowers1) {
                    if (Objects.equals(flower.toString(), selectedFlowerString)) {
                        selectedFlower = flower;
                        break;
                    }
                }
                addButton.setVisible(true);
            }
        });

    }

}

public void addToBouquet(ActionEvent event){

    Bouquet.addFlower(selectedFlower);
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

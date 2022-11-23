package Invokers;

import BouquetParts.*;
import Menus.Command;
import recievers.ChangeFlowerProperties;


public class SearchInvoker {
    Command changeProperties;
    Command searchFlower;
    Command searchAccessory;

    public SearchInvoker(Command searchFlower,Command searchAccessory){
        this.searchFlower=searchFlower;
        this.searchAccessory=searchAccessory;
    }


    public void changeProperties(Flower flower){
        changeProperties = new ChangeFlowerProperties(flower);
        changeProperties.execute();
    }

    public void searchFlower(){
        searchFlower.execute();
    }

    public void searchAccessory(){
        searchAccessory.execute();
    }

}

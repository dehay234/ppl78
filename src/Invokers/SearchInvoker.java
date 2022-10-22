package Invokers;

import BouquetParts.*;
import Menus.Command;
import recievers.ChangeFlowerProperties;


public class SearchInvoker {
    Command changeProperties;


    public SearchInvoker(){

    }


    public void changeProperties(Flower flower){
        changeProperties = new ChangeFlowerProperties(flower);
        changeProperties.execute();
    }

}

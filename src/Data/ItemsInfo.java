package Data;

import BouquetParts.Flower;

import java.util.ArrayList;

public class ItemsInfo {
    ArrayList<Flower> allFlowers;
    ItemsInfo(){}

    public void getAllFlowers(){

    }

    public Flower search(){
        return allFlowers.get(0);
    }

}

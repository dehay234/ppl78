package Data;

import BouquetParts.*;

import java.util.ArrayList;

public class ItemsInfo {
    static ArrayList<Flower> allFlowers;
    static ArrayList<Accessory> allAccessories;
    public ItemsInfo(){
        allFlowers = new ArrayList<Flower>();
        allAccessories = new ArrayList<Accessory>();
        allFlowers.add(new Flower("Lotus",1,20,50));
        allAccessories.add(new Accessory("Balloons",100));
    }

    public void getAllFlowers(){

    }

    public static void searchFlower(){
        System.out.println(allFlowers.get(0));
    }

    public static void searchAccessory(){
        System.out.println(allAccessories.get(0));
    }
}

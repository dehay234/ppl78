package Data;

import BouquetParts.Accessory;
import BouquetParts.Flower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DataSearchForVisualProgram {

    public static ArrayList<Integer> searchFlowByVariety(String variety){

        ArrayList<Integer> ids= new ArrayList<Integer>();

        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getVariety().equals(variety)) {
                ids.add(f.getId()-1);
            }
        }

        return ids;

    }
    public static ArrayList<Integer> searchFlowByLength(int length){


        ArrayList<Integer> ids= new ArrayList<Integer>();

        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getLength()<=length) {
                ids.add(f.getId()-1);
            }
        }
        return  ids;

    }

    public static ArrayList<Integer> searchFlowByPrice(int price){


        ArrayList<Integer> ids= new ArrayList<Integer>();

        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getPrice()<=price) {
                ids.add(f.getId()-1);
            }
        }

        return ids;

    }
    public static ArrayList<Integer> searchFlowByFreshness(int freshness){
        ArrayList<Integer> ids= new ArrayList<Integer>();

        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getFreshness()==freshness) {
                ids.add(f.getId()-1);
            }
        }


        return ids;

    }

    public static ArrayList<Integer> searchAccByVariety(String variety){

        ArrayList<Integer> ids= new ArrayList<Integer>();
        Iterator it = ItemsInfo.allAccessories.iterator();
        while (it.hasNext()){
            Accessory f = (Accessory) it.next();
            if(f.getVariety().equals(variety)) {
                ids.add(f.getId()-1);
            }
        }

        return ids;

    }

    public static ArrayList<Integer> searchAccByPrice(int price){
        ArrayList<Integer> ids= new ArrayList<Integer>();
        Iterator it = ItemsInfo.allAccessories.iterator();
        while (it.hasNext()){
            Accessory accessory = (Accessory) it.next();
            if(accessory.getPrice()<=price) {
                ids.add(accessory.getId()-1);
            }
        }

        return ids;

    }


}

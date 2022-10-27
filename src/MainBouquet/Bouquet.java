package MainBouquet;

import BouquetParts.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Flow;

public class Bouquet {
    private static int price;
    private static ArrayList<Flower> flowers;

    public Bouquet(){
        flowers = new ArrayList<Flower>();
        flowers.add(new Flower("Anemone",2,15,25));
        flowers.add(new Flower("Sesylia",1,14,20));

    }
    public static void showBouquet(){
        Iterator it = flowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            System.out.println(f);
        }
    }
    public Flower getFlower(){
        return flowers.get(1);
    }
    public static void addFlower(){
        System.out.println("Flower added");
    }

    public static void addAccessory(){
        System.out.println("Accessory added");
    }

    public static void deleteFlower(){
        System.out.println("Flower deleted");
    }
    public static void deleteAccessory(){
        System.out.println("Accessory edited");
    }

    public static void buyBouquet(){
        System.out.println("Bouquet is bought");
    }

    public void sort(){
        Collections.sort(flowers,new LengthComparator());
    }
    class LengthComparator implements Comparator<Flower> {
        public int compare(Flower f1,Flower f2){
            return f1.getLength()-f2.getLength();
        }
    }

}

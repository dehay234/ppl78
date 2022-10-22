package MainBouquet;

import BouquetParts.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Bouquet {
    private int price;
    private ArrayList<Flower> flowers;

    public Bouquet(){
        flowers = new ArrayList<Flower>();
        flowers.add(new Flower("Anemone",2,15,25));
        flowers.add(new Flower("Sesylia",1,14,20));

    }
    public void showBouquet(){
        Iterator it = flowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            System.out.println(f);
        }
    }
    public Flower getFlower(){
        return flowers.get(1);
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

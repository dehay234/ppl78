package MainBouquet;

import BouquetParts.Accessory;
import BouquetParts.Flower;
import logging.Logging;

import java.util.*;
import java.util.concurrent.Flow;

public class Bouquet {
    private static int price;
    private static ArrayList<Flower> flowers;
    private static  ArrayList<Accessory>accessories;
    public Bouquet(){
    }
    public  Bouquet(int i){
        flowers = new ArrayList<Flower>();
        accessories= new ArrayList<Accessory>();
    }

    public static boolean showBouquet(){
        System.out.println("Flowers:");
        Iterator it = flowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            System.out.println(f);
        }
        System.out.println("Accessories:");
        for(Accessory acc : accessories){
            System.out.println(acc);
        }
        System.out.println();
        return true;
    }

    public static void addFlower(Flower flower){
        System.out.println("Flower added");
        flowers.add(flower);
        price+=flower.getPrice();
    //    Logging.getLogger().info("Flower added to bouquet");
    }

    public static void addAccessory(Accessory accessory){
        System.out.println("Accessory added");
        accessories.add(accessory);
        price+= accessory.getPrice();
     //   Logging.getLogger().info("Accessory added to bouquet");
    }

    public static String deleteFlower(){
        Scanner scanner = new Scanner(System.in);
        int iter = 0;
        for(Flower f : flowers){
            if(iter==0)
                System.out.println("Select flower to delete:");
            iter++;
            System.out.println(iter + ". " + f);
        }

        if(iter == 0){
            System.out.println("Bouquet is empty");
            return "Bouquet is empty";
        }

        int choice = scanner.nextInt();

        if(choice<=0||choice>iter){
            System.out.println("Wrong choice!");
            return "Wrong choice!";
        }

        price-= flowers.get(choice-1).getPrice();
        flowers.remove(choice-1);

        System.out.println("Flower removed successfully");
      //  Logging.getLogger().info("Flower was removed from bouquet");
        return "Flower removed successfully";


    }
    public static String deleteAccessory(){
        Scanner scanner = new Scanner(System.in);
        int iter = 0;
        for(Accessory acc : accessories){
            if(iter==0)
                System.out.println("Select accessory to delete:");
            iter++;
            System.out.println(iter + ". " + acc);
        }

        if(iter == 0){
            System.out.println("There is no accessories");
            return "There is no accessories";
        }

        int choice = scanner.nextInt();

        if(choice<=0||choice>iter){
            System.out.println("Wrong choice!");
            return "Wrong choice!";
        }
        price -= accessories.get(choice-1).getPrice();
        accessories.remove(choice-1);
        System.out.println("Accessory removed successfully");
       // Logging.getLogger().info("Accessory was removed from bouquet");
        return "Accessory removed successfully";

    }

    public static void buyBouquet(){
        System.out.println("Bouquet costs "+ price);
        Logging.getLogger().info("Bouquet was sold for "+price);
        System.exit(1);
    }

    public static ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public static ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public boolean sort(){
        flowers.sort(new LengthComparator());
        return checkSort();
    }

    public boolean checkSort(){
        for(int i = 0; i<flowers.size()-1;i++){
            if(flowers.get(i).getLength()>flowers.get(i+1).getLength())
                return false;
        }
        return  true;
    }

    static class LengthComparator implements Comparator<Flower> {
        public int compare(Flower f1,Flower f2){
            return f1.getLength()-f2.getLength();
        }
    }

}

package Data;

import BouquetParts.*;

import java.util.Iterator;
import java.util.Scanner;

public class DataSearch {
    public static Flower searchFlowByVariety(){
        System.out.print("Enter variety: ");
        Scanner scanner = new Scanner(System.in);
        String variety = scanner.nextLine();
        Flower res;
        int iterator=0;
        System.out.println("Choose flower: ");
        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getVariety().equals(variety)) {
                iterator++;
                System.out.println(f.getId()+". "+f);
            }
            }
        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allFlowers.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }

        else
            res = ItemsInfo.allFlowers.get(id-1);

        return res;

    }
    public static Flower searchFlowByLength(){
        Flower res;
        int iterator=0,over,length;


        System.out.print("Enter Length: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        over = scanner.nextInt();

        System.out.println("Choose flower: ");
        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(over==1?f.getLength()<=length:f.getLength()>=length) {
                iterator++;
                System.out.println(f.getId()+". "+f);
            }
        }
        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allFlowers.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }
        else
            res = ItemsInfo.allFlowers.get(id-1);

        return res;

    }

    public static Flower searchFlowByPrice(){
        Flower res;
        int iterator=0,over,price;


        System.out.print("Enter Price: ");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        over = scanner.nextInt();

        System.out.println("Choose flower: ");
        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(over==1?f.getPrice()<=price:f.getPrice()>=price) {
                iterator++;
                System.out.println(f.getId()+". "+f);
            }
        }

        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allFlowers.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }

        else
            res = ItemsInfo.allFlowers.get(id-1);

        return res;

    }
    public static Flower searchFlowByFreshness(){
        Flower res;
        int iterator=0,freshness;


        System.out.print("Enter Freshness: ");
        Scanner scanner = new Scanner(System.in);
        freshness = scanner.nextInt();

        System.out.println("Choose flower: ");
        Iterator it = ItemsInfo.allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            if(f.getFreshness()==freshness) {
                iterator++;
                System.out.println(f.getId()+". "+f);
            }
        }
        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allFlowers.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }

        else
            res = ItemsInfo.allFlowers.get(id-1);

        return res;

    }

    public static Accessory searchAccByVariety(){
        System.out.print("Enter variety: ");
        Scanner scanner = new Scanner(System.in);
        String variety = scanner.nextLine();
        Accessory res;
        int iterator=0;
        System.out.println("Choose accessory: ");
        Iterator it = ItemsInfo.allAccessories.iterator();
        while (it.hasNext()){
            Accessory f = (Accessory) it.next();
            if(f.getVariety().equals(variety)) {
                iterator++;
                System.out.println(f.getId()+". "+f);
            }
        }
        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allAccessories.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }
        else
            res = ItemsInfo.allAccessories.get(id-1);

        return res;

    }

    public static Accessory searchAccByPrice(){
        Accessory res;
        int iterator=0,over,price;


        System.out.print("Enter Price: ");
        Scanner scanner = new Scanner(System.in);
        price = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        over = scanner.nextInt();

        System.out.println("Choose accessory: ");
        Iterator it = ItemsInfo.allAccessories.iterator();
        while (it.hasNext()){
            Accessory accessory = (Accessory) it.next();
            if(over==1?accessory.getPrice()<=price:accessory.getPrice()>=price) {
                iterator++;
                System.out.println(accessory.getId()+". "+accessory);
            }
        }
        if(iterator==0){
            System.out.println("No matching results");
            return null;
        }
        int id = scanner.nextInt();


        if(id>ItemsInfo.allFlowers.size()||id<0){
            System.out.println("Wrong choice! ");
            res = null;
        }

        else
            res = ItemsInfo.allAccessories.get(id-1);

        return res;

    }


}

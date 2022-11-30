package Data;

import BouquetParts.*;

import java.util.Iterator;
import java.util.Scanner;

public class DataSearch {
    public static Flower searchFlowByVariety(String variety){
        System.out.print("Enter variety: ");
        Scanner scanner = new Scanner(System.in);
        if(variety==null) variety = scanner.nextLine();
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
    public static Flower searchFlowByLength(int length,int over){
        Flower res;
        int iterator=0;


        System.out.print("Enter Length: ");
        Scanner scanner = new Scanner(System.in);
        if(length == 0) length = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        if(over == 0)over = scanner.nextInt();

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

    public static Flower searchFlowByPrice(int price, int over){
        Flower res;
        int iterator=0;


        System.out.print("Enter Price: ");
        Scanner scanner = new Scanner(System.in);
        if(price==0)price = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        if(over ==0)over = scanner.nextInt();

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
    public static Flower searchFlowByFreshness(int freshness){
        Flower res;
        int iterator=0;


        System.out.print("Enter Freshness: ");
        Scanner scanner = new Scanner(System.in);
        if(freshness==0) freshness = scanner.nextInt();

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

    public static Accessory searchAccByVariety(String variety){
        System.out.print("Enter variety: ");
        Scanner scanner = new Scanner(System.in);
        if (variety==null) variety = scanner.nextLine();
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

    public static Accessory searchAccByPrice(int price,int over){
        Accessory res;
        int iterator=0;


        System.out.print("Enter Price: ");
        Scanner scanner = new Scanner(System.in);
        if(price==0) price = scanner.nextInt();

        System.out.print("Do you want to search for lower(1) or higher(2)? ");
        if(over==0) over = scanner.nextInt();

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

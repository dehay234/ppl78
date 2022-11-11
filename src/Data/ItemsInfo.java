package Data;

import BouquetParts.*;
import Invokers.BouquetInvoker;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ItemsInfo {
    static ArrayList<Flower> allFlowers;
    static ArrayList<Accessory> allAccessories;
    public ItemsInfo() {
        allFlowers = new ArrayList<Flower>();
        allAccessories = new ArrayList<Accessory>();

        String url = "jdbc:sqlserver://DESKTOP-RJ2HHJ7\\SQLEXPRESS;database=PPL6;integratedSecurity=true";


        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");
            getAllFlowers(connection);
            getAllAccessories(connection);

        } catch (SQLException e) {
            System.out.println("No Connection");
            e.printStackTrace();
        }


    }

    public void getAllFlowers(Connection conn) throws SQLException {
        int id=1;
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("Select * from dbo.Flowers");
        while(rs.next()){
            Flower f = new Flower(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4));
            f.setId(id);
            allFlowers.add(f);
            id++;
        }

    }
    public void getAllAccessories(Connection conn) throws SQLException {
        int id = 1;
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("Select * from dbo.Accessory");
        while(rs.next()){
            Accessory acc = new Accessory(rs.getString(1),rs.getInt(2));
            acc.setId(id);
            allAccessories.add(acc);
            id++;
        }

    }

    public static void showFlowers(){
        Iterator it = allFlowers.iterator();
        while (it.hasNext()){
            Flower f = (Flower)it.next();
            System.out.println(f);
        }
    }
    public static void showAccessories(){
        Iterator it = allAccessories.iterator();
        while (it.hasNext()){
            Accessory acc = (Accessory) it.next();
            System.out.println(acc);
        }
    }
    public static void searchFlower(){
        Flower flower=null;
        System.out.println("Choose parameter:\n" +
                "1. Variety\n" +
                "2. Length\n" +
                "3. Freshness\n" +
                "4. Price\n" +
                "5. Back");
        Scanner scanner = new Scanner(System.in);
        int choice= scanner.nextInt();
        if(choice==1)
            flower = DataSearch.searchFlowByVariety();
        else if(choice==2)
            flower = DataSearch.searchFlowByLength();
        else if(choice==3)
            flower = DataSearch.searchFlowByFreshness();
        else if (choice==4)
            flower = DataSearch.searchFlowByPrice();
        else if (choice==5)
            return;
        else
            System.out.println("Wrong choice!");

        if(flower!=null){
            System.out.println("Choose what you want to do with flower?\n" +
                    "1. Change properties\n" +
                    "2. Add flower to bouquet\n" +
                    "3. Go back to search menu");
            choice = scanner.nextInt();
            if(choice==1){
                flower.changeProperties();
            }
            else if(choice==2){
                BouquetInvoker inv = new BouquetInvoker(flower,null);
                inv.addFlower();
            }
        }

    }

    public static void searchAccessory(){
        Accessory acc=null;
        System.out.println("Choose parameter:\n" +
                "1. Variety\n" +
                "2. Price\n" +
                "3. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice= scanner.nextInt();
        if(choice==1)
            acc = DataSearch.searchAccByVariety();
        else if(choice==2)
            acc = DataSearch.searchAccByPrice();
        else if(choice==3)
            return;
        else
            System.out.println("Wrong choice!");

        if(acc!=null){
            System.out.println("Choose what you want to do with Accessory?\n" +
                    "1. Add accessory to bouquet\n" +
                    "2. Go back to search menu");
            choice = scanner.nextInt();
            if(choice==1){
                BouquetInvoker inv = new BouquetInvoker(null,acc);
                inv.addAccessory();
            }
        }
    }
}

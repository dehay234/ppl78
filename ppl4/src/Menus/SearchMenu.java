package Menus;
import Invokers.SearchInvoker;
import MainBouquet.*;
import recievers.SearchAccessory;
import recievers.SearchFlower;

import java.util.Scanner;

public class SearchMenu {

    public SearchMenu(){


        Scanner scanner = new Scanner(System.in);
        Command searchAccessory =new SearchAccessory();
        Command searchFlower = new SearchFlower();
        boolean loop = true;
        SearchInvoker invoker = new SearchInvoker(searchFlower,searchAccessory);
        while (loop) {
            System.out.println("---------Search Menu----------\n" +
                    "1.Search flower\n" +
                    "2.Search accessory\n"+
                    "3.Exit");
            int choice = scanner.nextInt();
            if (choice == 1)
                invoker.searchFlower();
            else if (choice == 2)
                invoker.searchAccessory();
            else if (choice == 3)
                loop=false;
            else
                System.out.println("Wrong choice");
        }


    }



}

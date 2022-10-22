package Menus;
import Invokers.SearchInvoker;
import MainBouquet.*;
import recievers.SearchAccessory;
import recievers.SearchFlower;

import java.util.Scanner;

public class SearchMenu {

    public SearchMenu(){
        System.out.println("---------Search Menu----------\n" +
                "1.Search flower\n" +
                "2.Search accessory\n"+
                "3.Change flower properties");

        Scanner scanner = new Scanner(System.in);
        /*Bouquet b1 = new Bouquet();
        SearchInvoker invoker = new SearchInvoker();
        invoker.changeProperties(b1.getFlower());
        b1.showBouquet();*/
        Command searchAccessory =new SearchAccessory();
        Command searchFlower = new SearchFlower();

        SearchInvoker invoker = new SearchInvoker(searchFlower,searchAccessory);

        int choice =scanner.nextInt();
        if(choice==1)
            searchFlower.execute();
        else
            searchAccessory.execute();

    }



}

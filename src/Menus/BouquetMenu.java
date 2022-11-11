package Menus;

import Invokers.BouquetInvoker;

import java.util.Scanner;
import org.junit.Test;
public class BouquetMenu {

    public BouquetMenu(){

        BouquetInvoker invoker = new BouquetInvoker(null,null);
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while(loop) {
            System.out.println("---------Bouquet menu----------\n" +
                    "1.Delete flower\n" +
                    "2.Delete accessory\n" +
                    "3.Buy bouquet\n" +
                    "4.Show bouquet\n" +
                    "5.Sort bouquet\n" +
                    "6.Back");
            int choice = scanner.nextInt();
            if (choice == 1)
                invoker.delFlower();

            else if (choice == 2)
                invoker.delAccessory();

            else if (choice == 3)
                invoker.buyBouquet();

            else if (choice == 4)
                invoker.showBouquet();

            else if (choice == 5)
                invoker.sort();

            else if (choice == 6)
                loop = false;

            else
                System.out.println("Wrong choice");

        }
        }
}

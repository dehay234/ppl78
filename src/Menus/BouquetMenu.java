package Menus;

import Invokers.BouquetInvoker;

import java.util.Scanner;

public class BouquetMenu {

    public BouquetMenu(){

        BouquetInvoker invoker = new BouquetInvoker();
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while(loop) {
            System.out.println("---------Bouquet menu----------\n" +
                    "1.Add flower\n" +
                    "2.Add accessory\n"+
                    "3.Delete flower\n" +
                    "4.Delete accessory\n" +
                    "5.Buy bouquet\n" +
                    "6.Show bouquet\n" +
                    "7.Back");
            int choice = scanner.nextInt();
            if (choice == 1)
                invoker.addFlower();

            else if (choice == 2)
                invoker.addAccessory();

            else if (choice == 3)
                invoker.delFlower();

            else if (choice == 4)
                invoker.delAccessory();

            else if (choice == 5)
                invoker.buyBouquet();

            else if (choice == 6)
                invoker.showBouquet();

            else if (choice == 7)
                loop = false;

            else
                System.out.println("Wrong choice");

        }
        }
}

package Menus;

import Invokers.CustomerInvoker;
import recievers.*;

import java.util.Scanner;

public class Customer {

    public Customer(){
        Scanner scanner = new Scanner(System.in);
        Command search = new CallSearchMenu();
        Command bouquet = new CallBouquetMenu();
        boolean exit = false;

        CustomerInvoker menu = new CustomerInvoker(search,bouquet);



        while (!exit) {
            System.out.println("__________Main menu___________\n" +
                    "Type:\n" +
                    "search: for search menu\n" +
                    "bouquet: for bouquet menu\n" +
                    "exit: to quit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "bouquet":
                    menu.BouquetM();
                    break;
                case "search":
                    menu.SearchM();
                    break;
                case "exit":
                    exit=true;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }








}




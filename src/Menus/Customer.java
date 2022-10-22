package Menus;

import Invokers.CustomerInvoker;
import recievers.*;

public class Customer {

    public Customer(){
        Command search = new CallSearchMenu();
        Command bouquet = new CallBouquetMenu();

        CustomerInvoker menu = new CustomerInvoker(search,bouquet);

        menu.BouquetM();
        menu.SearchM();


    }








}




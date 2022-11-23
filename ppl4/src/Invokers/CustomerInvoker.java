package Invokers;

import Menus.Command;

public class CustomerInvoker {
    Command search;
    Command bouquet;


    public CustomerInvoker(Command search1, Command bouquet1){
        search=search1;
        bouquet= bouquet1;
    }

    public void SearchM(){
        search.execute();
    }
    public void BouquetM(){
        bouquet.execute();
    }

}

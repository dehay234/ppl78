package Invokers;

import BouquetParts.*;
import Menus.Command;
import recievers.BouquetMenuRecievers.*;

public class BouquetInvoker {
    Command addFlow;
    Command addAcc;
    Command delFlow;
    Command delAcc;
    Command buy;
    Command show;
    Command sort;

    public BouquetInvoker(Flower f, Accessory accessory){
        addFlow = new AddFlower(f);
        addAcc = new AddAccessory(accessory);
        delFlow = new DeleteFlower();
        delAcc = new DeleteAccessory();
        buy = new BuyBouquet();
        show = new ShowBouquet();
        sort = new Sorter();
    }

    public void addFlower(){
        addFlow.execute();
    }
    public void addAccessory(){
        addAcc.execute();
    }
    public void delFlower(){
        delFlow.execute();
    }
    public void delAccessory(){
        delAcc.execute();
    }
    public void buyBouquet(){
        buy.execute();
    }
    public void showBouquet(){
        show.execute();
    }
    public void sort(){sort.execute();}



}

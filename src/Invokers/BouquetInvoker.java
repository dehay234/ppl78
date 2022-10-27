package Invokers;

import Menus.Command;
import recievers.BouquetMenuRecievers.*;

public class BouquetInvoker {
    Command addFlow;
    Command addAcc;
    Command delFlow;
    Command delAcc;
    Command buy;
    Command show;

    public BouquetInvoker(){
        addFlow = new AddFlower();
        addAcc = new AddAccessory();
        delFlow = new DeleteFlower();
        delAcc = new DeleteAccessory();
        buy = new BuyBouquet();
        show = new ShowBouquet();
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



}

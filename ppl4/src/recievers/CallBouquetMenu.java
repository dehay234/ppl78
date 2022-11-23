package recievers;

import Menus.*;

public class CallBouquetMenu implements Command {

    public void execute(){
        new BouquetMenu();
    }
}
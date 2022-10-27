package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class AddFlower implements Command {
    public void execute(){
        Bouquet.addFlower();
    }
}

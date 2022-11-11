package recievers.BouquetMenuRecievers;

import BouquetParts.Flower;
import MainBouquet.Bouquet;
import Menus.Command;

public class AddFlower implements Command {

    Flower flower;

    public AddFlower(Flower flower1){
        flower=flower1;
    }

    public void execute(){
        Bouquet.addFlower(flower);
    }
}

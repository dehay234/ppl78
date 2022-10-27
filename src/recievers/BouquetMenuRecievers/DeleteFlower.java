package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class DeleteFlower implements Command {
    @Override
    public void execute() {
        Bouquet.deleteFlower();
    }
}

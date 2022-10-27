package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class AddAccessory implements Command {
    @Override
    public void execute() {
        Bouquet.addAccessory();
    }
}

package recievers.BouquetMenuRecievers;

import BouquetParts.Accessory;
import MainBouquet.Bouquet;
import Menus.Command;

public class AddAccessory implements Command {

    private Accessory accessory;

    public AddAccessory(Accessory accessory1) {
        accessory= accessory1;
    }

    @Override
    public void execute() {
        Bouquet.addAccessory(accessory);
    }
}

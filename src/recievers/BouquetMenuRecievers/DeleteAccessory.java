package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class DeleteAccessory implements Command {
    @Override
    public void execute() {
        Bouquet.deleteAccessory();
    }
}

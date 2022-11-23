package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class ShowBouquet implements Command {
    @Override
    public void execute() {
        Bouquet.showBouquet();
    }
}

package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class BuyBouquet implements Command {
    @Override
    public void execute() {
        Bouquet.buyBouquet();
    }
}

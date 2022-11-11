package recievers.BouquetMenuRecievers;

import MainBouquet.Bouquet;
import Menus.Command;

public class Sorter implements Command {
    @Override
    public void execute() {
        new Bouquet().sort();
    }
}

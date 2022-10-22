package recievers;

import BouquetParts.*;
import Menus.*;

public class ChangeFlowerProperties implements Command {

    Flower flower;
    public ChangeFlowerProperties(Flower f1){
        flower=f1;
    }
    public void execute(){
        flower.changeProperties();
    }
}

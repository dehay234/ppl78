package recievers;

import Menus.Command;
import Menus.SearchMenu;

public class CallSearchMenu implements Command {

    public void execute(){
        new SearchMenu();
    }
}

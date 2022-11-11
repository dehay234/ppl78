import Data.ItemsInfo;
import MainBouquet.Bouquet;
import Menus.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        new Bouquet(0);
        new ItemsInfo();
        new Customer();

    }


}
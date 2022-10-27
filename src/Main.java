import Data.ItemsInfo;
import MainBouquet.Bouquet;
import Menus.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {

     /*   String url = "jdbc:sqlserver://DESKTOP-RJ2HHJ7\\SQLEXPRESS;database=sample;integratedSecurity=true";

        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("ne xyi");
        }catch (SQLException e){
            System.out.println("xyi");
            e.printStackTrace();
        }*/
        new Bouquet();
        new ItemsInfo();
        new Customer();

    }


}
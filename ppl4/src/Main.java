import Data.ItemsInfo;
import Mail.EmailSender;
import MainBouquet.Bouquet;
import Menus.Customer;
import logging.Logging;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, MessagingException {

        new Logging("D:\\Users\\user\\IdeaProjects\\ppl4\\src\\Logging.properties");
        new Bouquet(0);
        new ItemsInfo();
        new Customer();

    }


}
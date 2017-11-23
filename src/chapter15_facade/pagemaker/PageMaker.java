package chapter15_facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by nanca on 11/23/2017.
 */
public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomPage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("");
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

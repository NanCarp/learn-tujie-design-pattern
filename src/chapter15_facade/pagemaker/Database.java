package chapter15_facade.pagemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by nanca on 11/23/2017.
 */
public class Database {
    private Database(){}

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}

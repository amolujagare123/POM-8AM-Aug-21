package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

    public static void main(String[] args) throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("config/config.properties");

        // 2 create an object of the properties class
        Properties prop = new Properties();

        // 3. load this object with the file object
        prop.load(fis);

        // 4. get the values from the properties file using getProperty method
        System.out.println( prop.getProperty("url"));
        System.out.println( prop.getProperty("user"));
        System.out.println( prop.getProperty("pass"));





    }
}

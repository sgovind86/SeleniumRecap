package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {


    static public String getPropValue(String key) throws IOException {
        Properties props;
        FileInputStream fis;
        fis = new FileInputStream("src/Resources/Properties/Selenium.property");
        props = new Properties();
        props.load(fis);
        return props.getProperty(key);
    }
}

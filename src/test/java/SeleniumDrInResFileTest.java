//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class SeleniumDrInResFileTest {
//    WebDriver driver;
//    FileInputStream fis;
//    Properties props;
//
//    @BeforeTest
//    public void fileLoad() throws IOException {
//        fis = new FileInputStream("src/Resources/Properties/Selenium.property");
//        props = new Properties();
//        props.load(fis);
//    }
//
//    @Test
//    public void seleniumTest1(){
//        String myDriver = props.getProperty("browser");
//
//        if(myDriver.equalsIgnoreCase("Chrome")) {
//            System.setProperty("webdriver.chrome.driver", "src/Resources/Drivers/chromedriver.exe");
//             driver = new ChromeDriver();
//        }
//        else if(myDriver.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver", "");
//             driver = new FirefoxDriver();
//        }
//        driver.get(props.getProperty("URL"));
//        System.out.println(driver.getTitle());
//        driver.close();
//
//    }
//
//}

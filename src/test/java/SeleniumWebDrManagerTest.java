//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class SeleniumWebDrManagerTest {
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
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        else if(myDriver.equalsIgnoreCase("firefox")){
//             WebDriverManager.firefoxdriver().setup();
//             driver = new FirefoxDriver();
//        }
//        else if(myDriver.equalsIgnoreCase("edgeDriver")){
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        }
//        driver.get(props.getProperty("URL"));
//        System.out.println(driver.getTitle());
//        driver.close();
//
//    }
//
//}

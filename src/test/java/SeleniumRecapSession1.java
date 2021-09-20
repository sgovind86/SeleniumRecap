import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumRecapSession1 {
    WebDriver driver;
    @Test
    public void seleniumTest1(){
        String myDriver = "Chrome";
        if(myDriver.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
             driver = new ChromeDriver();
        }
        else if(myDriver.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "");
             driver = new FirefoxDriver();
        }
        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());
        driver.close();

    }

}

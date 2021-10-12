import PageObject.*;
import Utilities.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class SeleniumPageFactorySampleTest {
    WebDriver driver;
    AddressPage addressPage;
    Global global;
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @BeforeTest
    public void openBrowserTest() throws IOException {

        String myDriver = CommonUtils.getPropValue("browser");

        if(myDriver.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(myDriver.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(myDriver.equalsIgnoreCase("edgeDriver")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get(CommonUtils.getPropValue("URL"));
        System.out.println(driver.getTitle());
    }

    @Test
    public void myLoginAndMyAccountPageTest() throws IOException, InterruptedException {
        Thread.sleep(5000);
        homePage = new HomePage(driver);
        homePage.clkSignIn();
        loginPage = new LoginPage(driver);
        loginPage.inputEmail(CommonUtils.getPropValue("username"));
        loginPage.inputPassword(CommonUtils.getPropValue("password"));
        loginPage.clkSubmitButton();
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.clkMyAddress();
        global = new Global(driver);
        global.clkSignOut();
    }

    @AfterTest
    public void quitBrowserTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}






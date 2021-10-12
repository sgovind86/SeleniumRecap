package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePage extends Global{
    WebDriver driver;

    @FindBy(className = "login")
    WebElement signIn;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clkSignIn(){
        signIn.click();
//        return PageFactory.initElements(driver, LoginPage.class);
    }


}

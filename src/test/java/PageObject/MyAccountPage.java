package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Global{
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressLink;

    public MyAccountPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clkMyAddress(){
        myAddressLink.click();
    }

}

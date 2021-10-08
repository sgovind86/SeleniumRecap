package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Global{

    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressLink;

    public void clkMyAddress(){
        myAddressLink.click();
    }

}

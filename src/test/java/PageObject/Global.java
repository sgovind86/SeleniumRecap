package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Global {

    @FindBy(linkText = "Sign out")
    WebElement signOutLink;

    @FindBy(linkText = "Contact us")
    WebElement contactUsLink;

    public void clkSignOut(){
        signOutLink.click();
    }



}

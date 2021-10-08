package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Global{

    WebDriver driver;

    @FindBy(id ="email")
    WebElement emailTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    public void inputEmail(String myEmail){
        emailTextBox.sendKeys(myEmail);
    }

    public void inputPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public MyAccountPage clkSubmitButton(){
        signInButton.click();
        return PageFactory.initElements(driver, MyAccountPage.class);

    }

}

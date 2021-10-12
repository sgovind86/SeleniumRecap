package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Global{

    WebDriver driver;

    @FindBy(id ="email")
    WebElement emailTextBox;

    @FindBy(id = "passwd")
    WebElement passwordTextBox;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String myEmail){
        emailTextBox.sendKeys(myEmail);
    }

    public void inputPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public void clkSubmitButton(){
        signInButton.click();
 //       return PageFactory.initElements(driver, MyAccountPage.class);

    }

}

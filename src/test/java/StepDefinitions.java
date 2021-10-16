import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I launched automation practice")
    public void i_launched_automation_practice() {
        System.out.println("First Step");
    }

    @When("I clicked on signin page")
    public void i_clicked_on_signin_page() {
        System.out.println("Second Step");
    }

    @When("I enter valid login credentials on login")
    public void i_enter_valid_login_credentials_on_login() {
        System.out.println("three Step");
    }

    @Then("I been taken to my account page")
    public void i_been_taken_to_my_account_page() {
        System.out.println("fourth Step");
    }

}

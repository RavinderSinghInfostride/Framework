package StepDefinition;

import Pages.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        setup();
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        pageFactory.getLoginPage().enterLoginCredentials(username, password);
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        pageFactory.getLoginPage().clickLoginButton();
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        pageFactory.getLoginPage().landingPageVerificationAfterLogin();
    }

    @And("user logs out")
    public void user_logs_out()
    {
        pageFactory.getLoginPage().logout();
    }
}
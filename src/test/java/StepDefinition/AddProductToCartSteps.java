package StepDefinition;

import Pages.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCartSteps extends BaseClass {
    @Given("user is in login page")
    public void user_is_in_login_page() {
        setup();
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on login button$")
    public void user_enters_username_and_password_and_clicks_on_login_button(String username, String password) {
        pageFactory.getLoginPage().enterLoginCredentials(username, password);
        pageFactory.getLoginPage().clickLoginButton();
        pageFactory.getLoginPage().landingPageVerificationAfterLogin();
    }

    @And("click add to cart button of a product")
    public void click_add_to_cart_button_of_a_product() {
        pageFactory.getHomePage().addProductToCart();
    }

    @Then("product is added product")
    public void product_is_added_product() {
        pageFactory.getHomePage().productAddedVerify();
    }
}
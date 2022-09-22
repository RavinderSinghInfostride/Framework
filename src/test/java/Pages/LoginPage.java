package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By usernameInput = By.xpath("//input[@name='user-name']");
    By passwordInput = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@name='login-button']");
    By landingPageVerifyAfterLogin = By.xpath("//span[@class='title']");
    By hamburgerMenuButton = By.xpath("//button[contains(text(),'Open Menu')]");
    By logoutMenuOptionLink = By.xpath("//a[contains(text(),'Logout')]");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterLoginCredentials(String username, String password)
    {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public void landingPageVerificationAfterLogin()
    {
        String isProductPageDisplayed = driver.findElement(landingPageVerifyAfterLogin).getText();
        Assert.assertEquals("PRODUCTS", isProductPageDisplayed);
    }

    public void logout()
    {
        driver.findElement(hamburgerMenuButton).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutMenuOptionLink));
        driver.findElement(logoutMenuOptionLink).click();
    }
}
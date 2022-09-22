package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By addToCartButton = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By cartLink = By.xpath("//a[@class='shopping_cart_link']");
    By productAddedVerify = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
        driver.findElement(cartLink).click();
    }

    public void productAddedVerify() {
        String isCorrectProductAdded = driver.findElement(productAddedVerify).getText();
        Assert.assertEquals("Sauce Labs Backpack", isCorrectProductAdded);
    }
}
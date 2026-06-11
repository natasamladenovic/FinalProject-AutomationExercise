package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test (priority = 10) //Priority is used to define which test should run first and which should run later
    public void userCanOpenProductsPage() throws InterruptedException {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        homePage.clickProductsButton();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("products"));
    }

    @Test (priority = 20)
    public void userCanSearchProduct() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        Assert.assertTrue(productsPage.getBlueTop().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("Blue%20Top"));
    }

    @Test (priority = 30)
    public void userCanOpenProductDetails() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        Assert.assertTrue(productsPage.getAvailability().isDisplayed());
        Assert.assertTrue(productsPage.getCondition().isDisplayed());
        Assert.assertTrue(productsPage.getBrand().isDisplayed());
    }
}

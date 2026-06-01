package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test (priority = 20)
    public void userCanAddOneItemToCart() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        productsPage.clickAddToCartButton();
        productsPage.clickViewCartButton();
        Assert.assertEquals(cartPage.getProductInCart().getText(), "Blue Top");
    }

    @Test (priority = 30)
    public void userCanAddMoreThanOneItemToCart() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Sleeveless Dress");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        productsPage.clickAddToCartButton();
        productsPage.clickViewCartButton();
    }

    @Test (priority = 10)
    public void userCanRemoveItemFromTheCart() throws InterruptedException {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        homePage.clickProductsButton();
        productsPage.inputProductName("Sleeveless Dress");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        productsPage.clickAddToCartButton();
        productsPage.clickViewCartButton();
        cartPage.clickRemoveItemButton();
        Thread.sleep(2000);
        Assert.assertTrue(cartPage.getEmptyCartMessage().isDisplayed());
    }

    @Test (priority = 40)
    public void userCanProceedToCheckout() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.clickProceedToCheckoutButton();
        cartPage.clickPlaceOrderButton();
        cartPage.inputNameOnCard("Jane Doe");
        cartPage.inputCardNumber("1234 5678 9101 2345");
        cartPage.inputCvc("629");
        cartPage.inputExpirationMonth("08");
        cartPage.inputExpirationYear("2028");
        cartPage.clickPayAndConfirmOrderButton();
        Assert.assertTrue(cartPage.getOrderPlacedMessage().isDisplayed());
    }



}

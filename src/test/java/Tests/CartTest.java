package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void userCanAddOneItemToCart() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        productsPage.clickAddToCartButton();
        productsPage.clickViewCartButton();
        Assert.assertEquals(cartPage.getProductInCart().getText(), "Blue Top");
    }

    @Test
    public void userCanAddMoreThanOneItemToCart() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Sleeveless Dress");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
        productsPage.clickAddToCartButton();
        productsPage.clickViewCartButton();

    }

    @Test
    public void userCanRemoveItemFromTheCart() throws InterruptedException {
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

}

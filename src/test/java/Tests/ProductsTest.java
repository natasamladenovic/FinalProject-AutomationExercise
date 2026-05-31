package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void userCanOpenProductsPage() {
        homePage.clickProductsButton();
        Assert.assertTrue(driver.getCurrentUrl().contains("products"));
    }

    @Test
    public void userCanSearchProduct() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        Assert.assertTrue(productsPage.getBlueTop().isDisplayed());
    }

    @Test
    public void userCanOpenProductDetails() {
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
    }
}

package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test (priority = 10) //Priority oznacava po kom prioritetu ce se testovi izvrsavati
    public void userCanOpenProductsPage() { //Korisnik moze uspesno da otvori stranicu sa proizvodima
        homePage.clickProductsButton();
        Assert.assertTrue(driver.getCurrentUrl().contains("products"));
    }

    @Test (priority = 20)
    public void userCanSearchProduct() { //Korisnik moze uspesno da izvrsi pretragu proizvoda
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        Assert.assertTrue(productsPage.getBlueTop().isDisplayed());
    }

    @Test (priority = 30)
    public void userCanOpenProductDetails() { //Korisnik moze da otvori detaljne informacije o proizvodu
        homePage.clickProductsButton();
        productsPage.inputProductName("Blue Top");
        productsPage.clickSearchButton();
        productsPage.clickViewProductButton();
    }
}

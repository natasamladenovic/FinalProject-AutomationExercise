package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductInCart() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[2]/h4/a"));
    }

    public WebElement getRemoveItem() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a"));
    }

    public WebElement getEmptyCartMessage() {
        return driver.findElement(By.xpath("//p[@class='text-center']/b"));
    }




    public void clickRemoveItemButton() {
        getRemoveItem().click();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchField() {
        return driver.findElement(By.id("search_product"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.id("submit_search"));
    }

    public WebElement getBlueTop() {
        return driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img"));
    }

    public WebElement getProductDetail() {
        return driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
    }


    public void inputProductName(String productName) {
        getSearchField().clear();
        getSearchField().sendKeys("Blue Top");
    }

    public void clickSearchButton() {
        getSearchButton().click();
    }

    public void clickViewProductButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",
                getProductDetail());

        getProductDetail().click();
    }
}

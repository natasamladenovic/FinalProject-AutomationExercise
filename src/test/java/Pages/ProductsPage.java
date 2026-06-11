package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {


    WebDriver driver;

    // Constructor used to initialize the WebDriver for this page
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators used to find web elements so that Selenium can interact with them
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
    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
    }
    public WebElement getViewCartButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[2]/a"));
    }
    public WebElement getAvailability() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b"));
    }
    public WebElement getCondition() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b"));
    }
    public WebElement getBrand() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b"));
    }


    // Methods used to perform actions on page elements
    public void inputProductName(String productName) {
        getSearchField().clear();
        getSearchField().sendKeys(productName);
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
    public void clickAddToCartButton() {
        getAddToCartButton().click();
    }
    public void clickViewCartButton() {
        getViewCartButton().click();
    }




}

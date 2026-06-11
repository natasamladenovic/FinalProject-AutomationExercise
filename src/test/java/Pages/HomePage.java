package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    // Constructor used to initialize the WebDriver for this page
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }


    // Locators used to find web elements so that Selenium can interact with them
    public WebElement getSignupLoginButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
    }
    public WebElement getLogoutButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
    }
    public WebElement getProductsButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"));
    }
    public WebElement getContactUsButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a"));
    }
    public WebElement getDeleteAccountButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
    }
    public WebElement getAccountDeleteMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b"));
    }



    // Methods used to perform actions on page elements
    public void clickOnSignupLogin() {
        getSignupLoginButton().click();
    }

    public void clickLogoutButton() {
        getLogoutButton().click();
    }

    public void clickProductsButton() {
        getProductsButton().click();
    }

    public void clickContactUsButton() {
        getContactUsButton().click();
    }

    public void clickDeleteAccountButton() {
        getDeleteAccountButton().click();
    }



}

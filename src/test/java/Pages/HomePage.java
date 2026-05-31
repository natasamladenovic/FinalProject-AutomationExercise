package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getSignupLoginButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
    }
    public WebElement getLogoutButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
    }
    public WebElement getProductsButton() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"));
    }




    public void clickOnSignupLogin() {
        getSignupLoginButton().click();
    }

    public void clickLogoutButton() {
        getLogoutButton().click();
    }

    public void clickProductsButton() {
        getProductsButton().click();
    }



}

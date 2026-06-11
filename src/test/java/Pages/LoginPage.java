package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Constructor used to initialize the WebDriver for this page
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators used to find web elements so that Selenium can interact with them
    public WebElement getLoginEmailField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]"));
    }
    public WebElement getLoginPasswordField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"));
    }


    // Methods used to perform actions on page elements
    public void inputLoginEmail(String email) {
        getLoginEmailField().clear();
        getLoginEmailField().sendKeys(email);
    }
    public void inputLoginPassword(String password) {
        getLoginPasswordField().clear();
        getLoginPasswordField().sendKeys(password);
    }
    public void clickLoginButton() {
        getLoginButton().click();
    }


    // Assertions are placed in test classes to verify that the expected result is achieved

    // Verify that user is logged in
    public WebElement getLoggedInAsMessage() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/b"));
    }

    // Verify that Incorrect Email or Password message is displayed
    public WebElement getIncorrectEmailOrPasswordMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/p"));
    }

    // Verify that Wrong Email Pop Up message is displayed
    public WebElement getLoginToYourAccount () {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2"));
    }

}

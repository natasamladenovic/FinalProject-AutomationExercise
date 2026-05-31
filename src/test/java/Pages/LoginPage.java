package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginEmailField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]"));
    }

    public WebElement getLoginPasswordField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"));
    }

    public WebElement getLoggedInAsMessage() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/b"));
    }

    public WebElement getIncorrectEmailOrPasswordMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/p"));
    }



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
}

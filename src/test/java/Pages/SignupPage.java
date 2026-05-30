package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {

        WebElement nameField = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        nameField.sendKeys("Jane Doe");
    }

    public void enterEmail(String email) {

        WebElement emailField = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        emailField.sendKeys("janedoeqa26@gmail.com");
    }

    public void clickSignupButton() {

        WebElement signupButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
        signupButton.click();
    }



}

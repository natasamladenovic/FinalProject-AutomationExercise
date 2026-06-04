package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //Ovde, u okviru klase, cuvam WebDriver koji dobijam kroz konstruktor kako bih mogla da pristupam elementima na stranici
    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Za svaki element pravim lokator, pomocu getter metode pronalazim elemente
    public WebElement getLoginEmailField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]"));
    }
    public WebElement getLoginPasswordField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button"));
    }

    //Asertacije nam sluze da bismo proverili validnost testova
    public WebElement getLoggedInAsMessage() {
        return driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/b")); //Potvrda uspesnog logovanja
    }
    public WebElement getIncorrectEmailOrPasswordMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/p")); //Potvrda neuspesnog logovanja zbog nevalidnog password-a
    }
    public WebElement getLoginToYourAccount () {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2")); //Potvrda da smo i dalje na istoj stranici, kod polja za logovanje
    }



    //Napravila sam metode koje izvrsavaju akcije nad tim elementima (klik, unos podataka...)
    //Na ovaj nacin su testovi pregledniji i laksi za odrzavanje
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

package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    //koristi se na nivou klase
    WebDriver driver;

    //Driver koji pripada ovoj klasi, prosledjeni driver se smesta u driver ove klase
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }


    //Getteri, koje koristim da pronadjem elemente pomocu lokatora. Iz homePage stranice sam konkretno trazila lokatore
    //da pristupim ostalim starnicama
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



    //Metode koje sam ovde koristila mi sluze da klikom pristupim odredjenoj stranici iz homePage stranice.
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



}

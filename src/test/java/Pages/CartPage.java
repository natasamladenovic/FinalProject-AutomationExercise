package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    //Ovde, u okviru klase, cuvam WebDriver koji dobijam kroz konstruktor kako bih mogla da pristupam elementima na stranici
    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    //Za svaki element pravim lokator, pomocu getter metode pronalazim elemente
    public WebElement getRemoveItem() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a"));
    }
    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a"));
    }
    public WebElement getPlaceOrderButton() {
        return driver.findElement(By.xpath("/html/body/section/div/div[7]/a"));
    }

    public WebElement getNameOnCardField() {
        return driver.findElement(By.name("name_on_card"));
    }

    public WebElement getCardNumberField() {
        return driver.findElement(By.name("card_number"));
    }

    public WebElement getCvcField() {
        return driver.findElement(By.name("cvc"));
    }

    public WebElement getExpirationMonthField() {
        return driver.findElement(By.name("expiry_month"));
    }
    public WebElement getExpirationYearField() {
        return driver.findElement(By.name("expiry_year"));
    }

    public WebElement getPayAndConfirmOrder() {
        return driver.findElement(By.id("submit"));
    }


    //Asertacije nam sluze da bismo proverili validnost testova
    public WebElement getProductInCart() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[2]/h4/a")); //Potvrda da je proizvod u korpi
    }
    public WebElement getEmptyCartMessage() {
        return driver.findElement(By.xpath("//p[@class='text-center']/b")); //Potvrda da je korpa prazna
    }
    public WebElement getOrderPlacedMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b")); //Potvrda da je uspesno izvrsena porudzbina
    }
    public WebElement getTotal() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/thead/tr/td[5]"));
    }





    //Napravila sam metode koje izvrsavaju akcije nad tim elementima (klik, unos podataka...)
    //Na ovaj nacin su testovi pregledniji i laksi za odrzavanje
    public void clickRemoveItemButton() {
        getRemoveItem().click();
    }

    public void clickProceedToCheckoutButton() {
        getProceedToCheckoutButton().click();
    }

    //Metoda za scroll stranice do elementa gde se nalazi lokator
    public void clickPlaceOrderButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",
                getPlaceOrderButton());

        getPlaceOrderButton().click();
    }
    public void inputNameOnCard(String name) {
        getNameOnCardField().clear();
        getNameOnCardField().sendKeys(name);
    }
    public void inputCardNumber(String cardNumber) {
        getCardNumberField().clear();
        getCardNumberField().sendKeys(cardNumber);
    }
    public void inputCvc(String cvc) {
        getCvcField().clear();
        getCvcField().sendKeys(cvc);
    }
    public void inputExpirationMonth(String month) {
        getExpirationMonthField().clear();
        getExpirationMonthField().sendKeys(month);
    }
    public void inputExpirationYear(String year) {
        getExpirationYearField().clear();
        getExpirationYearField().sendKeys(year);
    }
    public void clickPayAndConfirmOrderButton() {
        getPayAndConfirmOrder().click();
    }

}

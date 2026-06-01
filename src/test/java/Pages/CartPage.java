package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductInCart() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[2]/h4/a"));
    }

    public WebElement getRemoveItem() {
        return driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a"));
    }

    public WebElement getEmptyCartMessage() {
        return driver.findElement(By.xpath("//p[@class='text-center']/b"));
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

    public WebElement getOrderPlacedMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b"));
    }




    public void clickRemoveItemButton() {
        getRemoveItem().click();
    }

    public void clickProceedToCheckoutButton() {
        getProceedToCheckoutButton().click();
    }

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

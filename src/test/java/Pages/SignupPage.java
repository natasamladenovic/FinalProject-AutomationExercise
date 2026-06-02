package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    //Koristi se na nivou klase
    WebDriver driver;

    //Konstruktor
    public SignupPage(WebDriver driver) {

        this.driver = driver;
    }

    //----------------------Signup Page-----------------------//

    public void enterName(String name) {

        WebElement nameField = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        nameField.sendKeys(name);
    }
    public void enterEmail(String email) {

        WebElement emailField = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        emailField.sendKeys(email);
    }
    public void clickSignupButton() {

        WebElement signupButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
        signupButton.click();
    }

    //--------------Enter Account Information-------------------//

    //Lokatori za registraciju
    public WebElement getMrsRadioButton() {
        return driver.findElement(By.id("id_gender2"));
    }

    public WebElement getPasswordField() {return driver.findElement(By.id("password"));}

    public WebElement getDayDropDown() {
        return driver.findElement(By.id("days"));
    }

    public WebElement getMonthDropDown() {
        return driver.findElement(By.id("months"));
    }

    public WebElement getYearDropDown() {
        return driver.findElement(By.id("years"));
    }


    //Metode za svaki unos u odredjeno polje
    public void clickMrsRadioButton() {

        getMrsRadioButton().click();
    }
    public void inputPassword(String password) {
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }
    //Metodu Select sam iskoristila ovde kako bih mogla da izaberem datum rodjenja iz padajuce liste
    public void selectDay(String day) {
        Select select = new Select(getDayDropDown());
        select.selectByVisibleText(day);
    }
    public void selectMonth(String month) {
        Select select = new Select(getMonthDropDown());
        select.selectByVisibleText(month);
    }
    public void selectYear(String year) {
        Select select = new Select(getYearDropDown());
        select.selectByVisibleText(year);
    }

    //-------------Address Information-----------------//

    //Lokatori za dodatne informacije za registraciju
    public WebElement getFirstNameField() {return driver.findElement(By.id("first_name"));}

    public WebElement getLastNameField() {
        return driver.findElement(By.id("last_name"));
    }

    public WebElement getAddressField() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCountryDropDown() {
        return driver.findElement(By.id("country"));
    }

    public WebElement getStateField() {
        return driver.findElement(By.id("state"));
    }

    public WebElement getCityField() {return driver.findElement(By.id("city"));}

    public WebElement getZipcodeField() {
        return driver.findElement(By.id("zipcode"));
    }

    public WebElement getMobileNumberField() {
        return driver.findElement(By.id("mobile_number"));
    }

    public WebElement getCreateAccountButton() {return driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button"));}

    public WebElement getClickContinueButton() {return driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));}


    //Metode za svaki unos u odredjeno polje
    public void inputFirstName(String firstName) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }
    public void inputAddress(String address) {
        getAddressField().clear();
        getAddressField().sendKeys(address);
    }
    public void selectCountry(String country) {
        Select select = new Select(getCountryDropDown());
        select.selectByVisibleText(country);
    }
    public void inputState(String state) {
        getStateField().clear();
        getStateField().sendKeys(state);
    }
    public void inputCity(String city) {
        getCityField().clear();
        getCityField().sendKeys(city);
    }
    public void inputZipcode(String zipcode) {
        getZipcodeField().clear();
        getZipcodeField().sendKeys(zipcode);
    }
    public void inputMobileNumber(String mobileNumber) {
        getMobileNumberField().clear();
        getMobileNumberField().sendKeys(mobileNumber);
    }
    public void clickCreateAccountButton() {

        getCreateAccountButton().click();
    }
    public void clickContinueButton() {

        getClickContinueButton().click();
    }

    //---------------------Asertacije-----------------------//

    //Sluze kao potvrda da li je test prosao ili pao
    public WebElement getAccountCreatedMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b"));//Potvrda uspesnog registrovanja
    }

    public WebElement getExistingEmailMessage() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/p"));//Potvrda neuspesnog registrovanja zbog vec registrovanog mejla
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));//Potvrda neuspesnog registrovanja nevalidnim mejlom (pop up poruka)
    }

    public WebElement getNewUserSignUp() {
        return driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/h2")); //Potvrda da smo i dalje na istoj stranici, kod polja za registraciju
    }








}

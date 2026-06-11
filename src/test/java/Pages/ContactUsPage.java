package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {


    WebDriver driver;

    // Constructor used to initialize the WebDriver for this page
    public ContactUsPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators used to find web elements so that Selenium can interact with them
    public WebElement getNameField() {
        return driver.findElement(By.name("name"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.name("email"));
    }

    public WebElement getSubjectField() {
        return driver.findElement(By.name("subject"));
    }

    public WebElement getMessageField() {
        return driver.findElement(By.id("message"));
    }

    public WebElement getUploadFileButton() {
        return driver.findElement(By.name("upload_file"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.name("submit"));
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]"));
    }



    // Methods used to perform actions on page elements
    public void inputName(String name) {
        getNameField().clear();
        getNameField().sendKeys(name);
    }
    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }
    public void inputSubject(String subject) {
        getSubjectField().clear();
        getSubjectField().sendKeys(subject);
    }
    public void inputMessage(String message) {
        getMessageField().clear();
        getMessageField().sendKeys(message);
    }
    public void uploadFile(String filePath) {
        getUploadFileButton().sendKeys("C:\\Users\\Natasa\\Desktop\\Hello.docx");
    }
    public void clickSubmitButton() {
        getSubmitButton().click();
    }




}

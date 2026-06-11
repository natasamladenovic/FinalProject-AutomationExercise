package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {

    @Test
    public void userCanSubmitContactForm() throws InterruptedException {

        homePage.clickContactUsButton();
        contactUsPage.inputName("Jane Doe");
        contactUsPage.inputEmail("janedoeqa26@gmail.com");
        contactUsPage.inputSubject("QA Project");
        contactUsPage.inputMessage("This is a test message");
        contactUsPage.uploadFile("C:\\Users\\Natasa\\Desktop\\Hello.docx");
        contactUsPage.clickSubmitButton();
        Thread.sleep(2000);
        Assert.assertTrue(contactUsPage.getSuccessMessage().isDisplayed());
    }


}

package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAccountTest extends BaseTest {

    @Test
    public void userCanDeleteAccount() throws InterruptedException {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Thread.sleep(5000);
        homePage.clickDeleteAccountButton();
        Assert.assertTrue(homePage.getAccountDeleteMessage().isDisplayed());
    }
}

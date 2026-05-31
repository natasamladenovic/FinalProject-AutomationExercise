package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void userCanLogin() throws InterruptedException {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getLoggedInAsMessage().isDisplayed());
        Thread.sleep(2000);
        homePage.clickLogoutButton();
        Assert.assertTrue(homePage.getSignupLoginButton().isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidEmail() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoe26gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertFalse(signupPage.getEmailField().getAttribute("validationMessage").isEmpty());
    }

    @Test
    public void userCannotLoginWithInvalidPassword() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Test91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getIncorrectEmailOrPasswordMessage().isDisplayed());
    }
}

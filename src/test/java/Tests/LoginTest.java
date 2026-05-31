package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void userCanLogin() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getLoggedInAsMessage().isDisplayed());
    }

    @Test
    public void userCannotLoginWithInvalidEmail() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoe26@gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getIncorrectEmailOrPasswordMessage().isDisplayed());
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

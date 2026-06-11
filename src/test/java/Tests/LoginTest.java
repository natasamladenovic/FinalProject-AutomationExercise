package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (priority = 10) //Priority is used to define which test should run first and which should run later
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

    @Test (priority = 20)
    public void userCannotLoginWithInvalidEmail() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoe26gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertFalse(signupPage.getEmailField().getAttribute("validationMessage").isEmpty());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        Assert.assertTrue(loginPage.getLoginToYourAccount().isDisplayed());
    }

    @Test (priority = 30)
    public void userCannotLoginWithInvalidPassword() {
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Test91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getIncorrectEmailOrPasswordMessage().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        Assert.assertTrue(loginPage.getLoginToYourAccount().isDisplayed());
    }
}

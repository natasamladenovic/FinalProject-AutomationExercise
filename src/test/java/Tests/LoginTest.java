package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (priority = 10) //Priority oznacava po kom prioritetu ce se testovi izvrsavati
    public void userCanLogin() throws InterruptedException { //Korisnik moze uspesno da se uloguje
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
    public void userCannotLoginWithInvalidEmail() { //Korisnik ne moze da se uloguje sa nevalidnim mejlom
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoe26gmail.com");
        loginPage.inputLoginPassword("Testqa91!");
        loginPage.clickLoginButton();
        Assert.assertFalse(signupPage.getEmailField().getAttribute("validationMessage").isEmpty());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        Assert.assertTrue(loginPage.getLoginToYourAccount().isDisplayed());
    }

    @Test (priority = 30)
    public void userCannotLoginWithInvalidPassword() { //Korisnik ne moze da se uloguje sa nevalidnom lozinkom
        homePage.clickOnSignupLogin();
        loginPage.inputLoginEmail("janedoeqa26@gmail.com");
        loginPage.inputLoginPassword("Test91!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.getIncorrectEmailOrPasswordMessage().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        Assert.assertTrue(loginPage.getLoginToYourAccount().isDisplayed());
    }
}

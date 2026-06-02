package Tests;


import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test (priority = 10) //Priority oznacava po kom prioritetu ce se testovi izvrsavati
    public void userCanOpenSignupPage() { //Test da korisnik moze da otvori SignupPage
        homePage.clickOnSignupLogin();

    }

    @Test (priority = 20)
    public void userCanStartRegistration() throws InterruptedException { //Test da korisnik moze da se registruje
        homePage.clickOnSignupLogin();
        signupPage.enterName("Jane Doe");
        signupPage.enterEmail("janedoeqa26@gmail.com");
        signupPage.clickSignupButton();
        signupPage.clickMrsRadioButton();
        signupPage.inputPassword("Testqa91!");
        signupPage.selectDay("26");
        signupPage.selectMonth("June");
        signupPage.selectYear("2000");
        signupPage.inputFirstName("Jane");
        signupPage.inputLastName("Doe");
        signupPage.inputAddress("Cornelia St. 26");
        signupPage.selectCountry("United States");
        signupPage.inputState("New York");
        signupPage.inputCity("New York");
        signupPage.inputZipcode("10001");
        signupPage.inputMobileNumber("+1(646)555-3890");
        signupPage.clickCreateAccountButton();
        Assert.assertTrue(signupPage.getAccountCreatedMessage().isDisplayed());
        signupPage.clickContinueButton();
        Thread.sleep(2000); //Ubacila sam Thread sleep na 2 sekunde kako ne bi program kliknuo na logout dugme pre nego sto se pojavi
        homePage.clickLogoutButton();
        Assert.assertTrue(homePage.getSignupLoginButton().isDisplayed());
    }

    @Test (priority = 30)
    public void userCannotRegisterWithExistingEmail() { //Test da korisnik ne moze da se uloguje sa vec registrovanim mejlom
        homePage.clickOnSignupLogin();
        signupPage.enterName("Jane Doe");
        signupPage.enterEmail("janedoeqa26@gmail.com");
        signupPage.clickSignupButton();
        Assert.assertTrue(signupPage.getExistingEmailMessage().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
        Assert.assertTrue(signupPage.getNewUserSignUp().isDisplayed());
    }

    @Test (priority = 40)
    public void userCannotRegisterWithInvalidEmail() { //Test da korisnik ne moze da se uloguje sa nevalidnim mejlom
        homePage.clickOnSignupLogin();
        signupPage.enterName("Jane Doe");
        signupPage.enterEmail("janedoeqa26gmail.com");
        signupPage.clickSignupButton();
        Assert.assertFalse(signupPage.getEmailField().getAttribute("validationMessage").isEmpty());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        Assert.assertTrue(signupPage.getNewUserSignUp().isDisplayed());
    }




}

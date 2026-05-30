package Tests;


import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void userCanOpenSignupPage() {
        homePage.clickOnSignupLogin();

    }

    @Test
    public void userCanStartRegistration() {
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

    }



}

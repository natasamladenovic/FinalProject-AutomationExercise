package Tests;


import Base.BaseTest;
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
    }



}

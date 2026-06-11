package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {  //Base Test contains common setup used by all classes

    //WebDriver used to control the browser
    public WebDriver driver;

    //Page object declaration
    public HomePage homePage;
    public SignupPage signupPage;
    public LoginPage loginPage;
    public ProductsPage productsPage;
    public CartPage cartPage;
    public ContactUsPage contactUsPage;

    @BeforeClass
    //Browser startup and page object initialization
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://automationexercise.com/");

        //Create instances of all Page classes used in the project
        homePage = new HomePage(driver);
        signupPage = new SignupPage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        contactUsPage = new ContactUsPage(driver);

    }

    @AfterClass
    //Close the browser after all tests are completed
    public void tearDown() {
        driver.quit();
    }


    // Common setup is placed in BaseTest to avoid code duplication
    // Page objects are initialized once and reused across test classes
    // The project follows the Page Object Model (POM) design pattern
    // Each page has its own class containing locators and methods
    // This improves code reusability, readability, and maintenance











}

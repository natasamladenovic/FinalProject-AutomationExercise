package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    //WebDriver koji se koristi u celom projektu
    public WebDriver driver;

    //Objekti svih stranica u projektu
    public HomePage homePage; // promenljiva koja ce cuvati objekat klase HomePage
    public SignupPage signupPage;
    public LoginPage loginPage;
    public ProductsPage productsPage;
    public CartPage cartPage;
    public ContactUsPage contactUsPage;

    @BeforeClass
    //Pokretanje browsera i inicijalizacija svih stranica
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://automationexercise.com/");

        //Ovde sam napravila objekte, (driver)-zato sto sam konstruktor napravila na svakom Page-u.
        homePage = new HomePage(driver);
        signupPage = new SignupPage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        contactUsPage = new ContactUsPage(driver);

    }

    @AfterClass
    //Zatvaranje browsera nakon zavrsetka testova
    public void tearDown() {
        driver.quit();
    }








}

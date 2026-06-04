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

public class BaseTest {   //Base Test koristim za zajednicku postavku svih testova. Njegova svrha je da izbegnem
                          //ponavljanje istog koda u svakoj test klasi

    //U BaseTestu se nalazi WebDriver koji koristimo za upravljanje browserom
    public WebDriver driver;

    //Ovde se nalazi deklaracija stranica
    public HomePage homePage;
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

        //U Base Testu kreiram i objekte svih Page klasa koje koristim u projektu
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

     //Sve metode i deklaracije se nalaze ovde kako bismo izbegli da svaka Test klasa ponovo pokrece browser i kreira
     // Page objekte. To bi dovelo do dupliranja kodova











}

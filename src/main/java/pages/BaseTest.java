package pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.BasePage;
import pages.EligibilityPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static WebDriver driver;
    public static org.apache.logging.log4j.Logger logger = LogManager.getLogger(BasePage.class);
    protected BasePage basePage;
    protected HomePage homePage;
    private final String AUT_URL = "https://sdrs-csl-rpo-lhr-dev-as.azurewebsites.net/Eligibility";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions co = new ChromeOptions();
        co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
        co.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
//        caps.setBrowserName("chrome");
//        caps.setPlatform(Platform.LINUX);
//        driver = new RemoteWebDriver(new URL("http://localhost:8082/"), caps);

        driver.manage().window().maximize();}
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(AUT_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
    }
    @AfterMethod
    public void FailedScreenshot(ITestResult testResult){
        if(ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+
                    "/resources/screenshots/" +
                    testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.BaseTest;
import pages.ChangingValuesPage;
import pages.EligibilityPage;
import pages.LoginPage;

public class TestCases extends BaseTest {
    EligibilityPage eligibilityPage = new EligibilityPage();
    LoginPage loginPage = new LoginPage();
    ChangingValuesPage changingValuesPage = new ChangingValuesPage();

    @Test
    public void testOne(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        for(int i = 1; i<=2;i++){
            eligibilityPage = EligibilityPage.openElibilityPage();
            String j = String.valueOf(i);
            loginPage.fillEmail();
            loginPage.fillPasswordField();
            logger.info("Type Username");
            logger.info("Type Password");
            js.executeScript("javascript:window.scrollBy(250,350)");
            loginPage.clickLoginButton();
            changingValuesPage.clickOpenOrganizationDetails();
            changingValuesPage.selectTradingName();
            driver.findElement(By.id("TradingName")).sendKeys(j);
            changingValuesPage.clickDropdown();
            changingValuesPage.clickLogout();
            logger.info("Logout");
        }
    }
    @Test
    public void testTwo() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        logger.info("Open browserstack");
        eligibilityPage = EligibilityPage.openElibilityPage();

        loginPage.fillEmail();
        loginPage.fillPasswordField();
        logger.info("Type Username");
        logger.info("Type Password");
        js.executeScript("javascript:window.scrollBy(250,350)");
        loginPage.clickLoginButton();

        changingValuesPage.clickDropdown();
        changingValuesPage.clickLogout();
        logger.info("Logout");
    }
}

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
        for(int i = 0; i<=2;i++){
            String j = String.valueOf(i);
            if(i==0){
                logger.info("Open browserstack");
                eligibilityPage = homePage.openElibilityPage();
                eligibilityPage.clickSaveButton();
                logger.info("Confirm the agreement");
                eligibilityPage.acceptCookies();
                logger.info("Accept Cookies");
            }
            else if(i>0){
                eligibilityPage.elseIfScenarioLink();
                logger.info("Open browserstack");
                eligibilityPage.clickSaveButton();
                logger.info("Confirm the agreement");
            }
            loginPage.fillUsernameField();
            loginPage.fillPasswordField();
            logger.info("Type Username");
            logger.info("Type Password");
            js.executeScript("javascript:window.scrollBy(250,350)");
            loginPage.clickLoginButton();
            changingValuesPage.clickStartRegisterButton();
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
        eligibilityPage = homePage.openElibilityPage();
        eligibilityPage.clickConfirmCheckbox();
        eligibilityPage.clickSaveButton();
        logger.info("Confirm the agreement");

        loginPage.fillUsernameField();
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

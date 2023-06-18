package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class ChangingValuesPage extends BasePage{
    private By dropdown = By.cssSelector("#navbarDropdown");
    private By logout = By.cssSelector("#navbarSupportedContent > ul > li.nav-item.dropdown.show > ul > li:nth-child(2) > a");
    private By openOrganizationDetails = By.cssSelector("#left-bar-list > li.list-group-item.border-0.filled-item.li-registration > a");
    private By tradingName = By.id("TradingName");
    public void clickDropdown(){
        click(dropdown);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickLogout(){
        click(logout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickOpenOrganizationDetails(){
        click(openOrganizationDetails);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void selectTradingName(){
        click(tradingName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void sendKeysToTradingName(){
        driver.findElement(By.id("TradingName"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }
}

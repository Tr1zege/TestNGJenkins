package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class ChangingValuesPage extends BasePage{
    private By dropdown = By.cssSelector("#navbarDropdown");
    private By logout = By.cssSelector("#navbarSupportedContent > ul > li.nav-item.dropdown.show > ul > li:nth-child(2) > a");
    private By startRegisterButton = By.id("rlg-register-start");
    private By tradingName = By.id("TradingName");
    public void clickDropdown(){
        click(dropdown);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickLogout(){
        click(logout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickStartRegisterButton(){
        click(startRegisterButton);
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

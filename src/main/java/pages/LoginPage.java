package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class LoginPage extends BasePage{
    private By username = By.id("Username");
    private By password = By.id("Password");
    private By loginButton = By.xpath("/html/body/div[1]/div[2]/div/div[4]/div/div/div/div/form/button[1]");
    public void fillUsernameField(){
        click(username);
        driver.findElement(username).sendKeys("test2604@test.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void fillPasswordField(){
        click(password);
        driver.findElement(password).sendKeys("Tr1thetest");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickLoginButton(){
        click(loginButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


}

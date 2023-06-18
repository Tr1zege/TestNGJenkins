package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPage extends BasePage{
    private By email = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.id("next");
    public void fillEmail(){
        click(email);
        driver.findElement(email).sendKeys("testdima1706@test.com");
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

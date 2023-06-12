package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class HomePage extends BasePage{
    private By confirmCheckbox = By.id("rlg-vm-rpo-select-confirm");

    public EligibilityPage openElibilityPage(){
        click(confirmCheckbox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new EligibilityPage();
    }

}

package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class EligibilityPage extends BasePage{
    private By saveButton = By.id("rlg-save-eligibility");
    private By cookies = By.xpath("/html/body/div[1]/div[2]/div/div[5]/div/div/div[2]/button[1]");
    private By confirmCheckbox = By.id("rlg-vm-rpo-select-confirm");
    private final String AUT_URL2 = "https://sdrs-csl-rpo-lhr-dev-as.azurewebsites.net/Eligibility";

    public void clickSaveButton(){
        click(saveButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void acceptCookies(){
        click(cookies);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void elseIfScenarioLink(){
        driver.get(AUT_URL2);
    }
    public void clickConfirmCheckbox(){
        click(confirmCheckbox);
    }




}

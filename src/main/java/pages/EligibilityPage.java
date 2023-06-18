package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class EligibilityPage extends BasePage{
    private final String AUT_URL2 = "https://rlgsdrscslb2cpoc.b2clogin.com/rlgsdrscslb2cpoc.onmicrosoft.com/b2c_1a_signin_dev" +
            "/oauth2/v2.0/authorize?client_id=a5d8e489-4ccc-4a1b-bbf5-a5f3dd2fdab7&redirect_uri=https%3A%2F%2Fsdrs-csl-rpo-lhr-dev-" +
            "as.azurewebsites.net%2Fsignin-oidc&response_type=code&scope=openid%20profile%20offline_access&code_challenge=hwJ4SO46V-" +
            "BivJqsnKzZIDIM6YjXZ4z1f-rk7nBFkt0&code_challenge_method=S256&response_mode=form_post&nonce=638225583947894929." +
            "MzFkNzBhNGQtZjg2NS00OWM3LWIzMjctZDY5ODE3OWU1YmRiODE4MWRhNjQtMTI2Mi00ZDZjLTgzMzgtY2IwOWQ3Yzc1M2Qz&client_info=1&x-" +
            "client-brkrver=IDWeb.2.11.1.0&signup-url=https%3A%2F%2Fsdrs-csl-rpo-lhr-dev-as.azurewebsites.net%2FAccount&state=" +
            "CfDJ8J4sE0ZgykpGhWcIoXDYa4Tk1BBtXLcxdcB6qjiuL0Z-YYROn1kHPQmRG82RM1cSJCy09THIQcZcHO_FH8vUpYEMtWN58v7vE_88LRrZQnbUOH_" +
            "nvMcyQq7MOZnUoAvMcX2FKa81yaahoLIGIoj0vwogG5hkl7Tg9oXffzSmiPY3bOkO8AClfHLME5jtH_n8je8k-jZbFrn9PgdTWE9en4pCLosONVAXc" +
            "WWHd4GXv1QZvmoYAsPNec_91MOkaY9q6je6KhW3JgWhYykrzSI_9aJKf8z3KNHcUv72r1xNgVH-LeKR" +
            "HXAmfZ3vDgb6kDhap5ParG9-aVAlJ0TUB6bxyoK9vWDlYO_mzK28sVe5h0t_Cz6eKrxkHwPWX6m2LdN5SqX3b0rtDfUIq8nunSGrz8JrsmlakUw_G" +
            "IXsKfv8VS51&x-client-SKU=ID_NET6_0&x-client-ver=6.30.0.0";

    public static EligibilityPage openElibilityPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new EligibilityPage();
    }

    public void elseIfScenarioLink(){
        driver.get(AUT_URL2);
    }



}

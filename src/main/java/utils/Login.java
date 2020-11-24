package utils;

import org.openqa.selenium.WebDriver;
import actions.FillLoginForm;

public class Login {
    public void loginDvSum(WebDriver driver) throws Exception {
        driver.get("https://devqa.dvsum.com/login");
        FillLoginForm fillLoginForm = new FillLoginForm(driver);
        fillLoginForm.enterCredentials();
        fillLoginForm.login();
    }
}

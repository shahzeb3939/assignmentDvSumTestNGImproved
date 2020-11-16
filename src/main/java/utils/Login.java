package utils;

import org.openqa.selenium.WebDriver;
import steps.actions.FillLoginForm;

public class Login {
    public void loginDvSum(WebDriver driver) {
        driver.get("https://devqa.dvsum.com/login");
        FillLoginForm fillLoginForm = new FillLoginForm();
        fillLoginForm.enterCredentials(driver);
        fillLoginForm.login(driver);
    }
}

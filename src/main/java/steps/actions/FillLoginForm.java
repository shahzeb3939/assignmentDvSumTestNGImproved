package steps.actions;

import components.dvSumLogin.DvSumLoginForm;
import org.openqa.selenium.WebDriver;

public class FillLoginForm {
    public void enterCredentials(WebDriver driver) {
        driver.findElement(DvSumLoginForm.emailField).sendKeys("testautomation@dvsum.com");
        driver.findElement(DvSumLoginForm.passwordField).sendKeys("1@Qwerty");
    }

    public void login(WebDriver driver) {
        driver.findElement(DvSumLoginForm.loginButton).click();
    }
}

package actions;

import components.dvSumLogin.DvSumLoginForm;
import org.openqa.selenium.WebDriver;

public class FillLoginForm {
    private WebDriver driver;

    public FillLoginForm(WebDriver driver){
        this.driver = driver;
    }
    public void enterCredentials() {
        driver.findElement(DvSumLoginForm.emailField).sendKeys("testautomation@dvsum.com");
        driver.findElement(DvSumLoginForm.passwordField).sendKeys("1@Qwerty");
    }

    public void login() {
        driver.findElement(DvSumLoginForm.loginButton).click();
    }
}

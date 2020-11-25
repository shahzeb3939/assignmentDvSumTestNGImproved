package steps;

import components.dvSumLogin.DvSumLoginForm;
import constants.Constants;
import org.openqa.selenium.WebDriver;

public class FillLoginForm {
    private WebDriver driver;

    public FillLoginForm(WebDriver driver){
        this.driver = driver;
    }
    public void enterCredentials() {
        driver.findElement(DvSumLoginForm.emailField).sendKeys(Constants.dvSumLoginUsername);
        driver.findElement(DvSumLoginForm.passwordField).sendKeys(Constants.dvSumLoginPassword);
    }

    public void login() {
        driver.findElement(DvSumLoginForm.loginButton).click();
    }
}

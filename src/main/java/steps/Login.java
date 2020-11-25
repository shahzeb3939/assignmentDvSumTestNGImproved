package steps;

import org.openqa.selenium.WebDriver;

public class Login {
    public void loginDvSum(WebDriver driver) throws Exception {
        driver.get(GotoPage.dvSumLoginPage);
        FillLoginForm fillLoginForm = new FillLoginForm(driver);
        fillLoginForm.enterCredentials();
        fillLoginForm.login();
    }
}

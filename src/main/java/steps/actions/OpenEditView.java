package steps.actions;

import components.columnDictionary.ViewSetting;
import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEditView {
    private WebDriver driver;
    public OpenEditView(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.navigate().refresh();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(ViewSetting.viewSettingButton));
        driver.findElement(ViewSetting.viewSettingButton).click();
        driver.findElement(ViewSetting.editViewButton).click();
    }
}

package steps;

import components.columnDictionary.ViewSetting;
import org.openqa.selenium.WebDriver;

public class OpenEditView {
    private WebDriver driver;
    public OpenEditView(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.navigate().refresh();
        driver.findElement(ViewSetting.viewSettingButton).click();
        driver.findElement(ViewSetting.editViewButton).click();
    }
}

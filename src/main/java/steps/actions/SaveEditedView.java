package steps.actions;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;

public class SaveEditedView {
    private WebDriver driver;
    public SaveEditedView(WebDriver driver) {
        this.driver = driver;
    }

    public void save() {
        driver.findElement(EditViewForm.saveButton).click();
    }
}

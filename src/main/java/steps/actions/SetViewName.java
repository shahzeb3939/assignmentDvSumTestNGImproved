package steps.actions;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;

public class SetViewName {
    private WebDriver driver;

    public SetViewName(WebDriver driver){
        this.driver = driver;
    }

    public void set(String newViewName) {
        driver.findElement(EditViewForm.viewNameField).clear();
        driver.findElement(EditViewForm.viewNameField).sendKeys(newViewName);
    }
}

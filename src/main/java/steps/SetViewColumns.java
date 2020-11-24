package steps;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.StringToList;

import java.util.List;

public class SetViewColumns {
    private WebDriver driver;
    public SetViewColumns(WebDriver driver) {
        this.driver = driver;
    }

    public void set(String columnsToSelectString) {
        List<String> columnsToSelect = StringToList.convertToList(columnsToSelectString);
        driver.findElement(EditViewForm.deSelectAllColumnsButton).click();

        Actions action = new Actions(driver);
        columnsToSelect.forEach(columnName -> {
            action.dragAndDrop(driver.findElement(EditViewForm.getByObjectFromString(columnName)), driver.findElement(EditViewForm.emptySelectedColumn)).build().perform();
        });
    }
}


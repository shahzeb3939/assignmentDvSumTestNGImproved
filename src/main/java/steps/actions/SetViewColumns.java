package steps.actions;

import org.openqa.selenium.WebDriver;
import utils.UpdateEditViewColumns;

public class SetViewColumns {
    private WebDriver driver;
    public SetViewColumns(WebDriver driver) {
        this.driver = driver;
    }

    public void set() {
        UpdateEditViewColumns updatedEditViewColumns = new UpdateEditViewColumns(driver);
        updatedEditViewColumns.allColumnsList.forEach((listItem)->{
            System.out.println(listItem.getText());
        });
    }
}

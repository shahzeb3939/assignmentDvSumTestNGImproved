package utils;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UpdateEditViewColumns {
    private WebDriver driver;

    public UpdateEditViewColumns(WebDriver driver){
        this.driver = driver;
        updateAllColumnsList();
    }

    public List<WebElement> availableColumnsList;
    public List<WebElement> selectedColumnsList;
    public List<WebElement> allColumnsList;

    private void updateAvailableColumnsList(){
        availableColumnsList = driver.findElements(EditViewForm.availableColumns);
    }

    private void updateSelectedViewColumns(){
        selectedColumnsList = driver.findElements(EditViewForm.selectedColumns);
    }

    private void updateAllColumnsList(){
        updateAvailableColumnsList();
        updateSelectedViewColumns();
        allColumnsList = new ArrayList<WebElement>();
        allColumnsList.addAll(availableColumnsList);
        allColumnsList.addAll(selectedColumnsList);
    }
}

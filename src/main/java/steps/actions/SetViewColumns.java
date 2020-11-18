package steps.actions;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.UpdateEditViewColumns;

import java.util.List;

public class SetViewColumns {
    private WebDriver driver;
    public SetViewColumns(WebDriver driver) {
        this.driver = driver;
    }

    public void set(List<String> columnsToSelect) {
        UpdateEditViewColumns updatedEditViewColumns = new UpdateEditViewColumns(driver);
        driver.findElement(EditViewForm.deSelectAllColumnsButton).click();
        updatedEditViewColumns.updateAllColumnsList();
        Actions action = new Actions(driver);
        updatedEditViewColumns.allColumnsList.forEach((listItem)->{
            if(columnsToSelect.contains(listItem.getText())){
                action.dragAndDrop(listItem, driver.findElement(EditViewForm.emptySelectedColumn)).build().perform();
            }
        });
    }
}



//        updatedEditViewColumns.allColumnsList.forEach((listItem)->{
//        System.out.println(listItem.getText());
//        });

//        System.out.println(i);
//        System.out.println(updatedEditViewColumns.allColumnsList.get(i).getText());

//        action.clickAndHold(driver.findElement(EditViewForm.availableColumns));
//        action.dragAndDrop(driver.findElement(EditViewForm.availableColumns), driver.findElement(EditViewForm.selectedColumns));

//        for(int i = 0; i < noOfColumns; i++){
//        action.dragAndDrop(driver.findElement(EditViewForm.availableColumns), driver.findElement(EditViewForm.selectedColumns)).build().perform();
//        }


//                UpdateEditViewColumns updatedEditViewColumns = new UpdateEditViewColumns(driver);
//                driver.findElement(EditViewForm.deSelectAllColumnsButton).click();
//                updatedEditViewColumns.updateAllColumnsList();
//                Actions action = new Actions(driver);
//                updatedEditViewColumns.allColumnsList.forEach((listItem)->{
//                System.out.println(listItem.getText());
//                });
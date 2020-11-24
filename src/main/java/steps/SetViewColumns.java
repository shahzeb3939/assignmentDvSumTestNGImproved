package steps;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.StringToList;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SetViewColumns {
    private WebDriver driver;
    public SetViewColumns(WebDriver driver) {
        this.driver = driver;
    }

    public void set(String columnsToSelectString) {
        List<String> columnsToSelect = StringToList.convertToList(columnsToSelectString);
        driver.findElement(EditViewForm.deSelectAllColumnsButton).click();

//        WebDriverWait wait = new WebDriverWait(driver, 5);
////        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='selectedColumns'][count(li)=0]"))));
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[@id='selectedColumns'][count(li)=0]"))));

        Actions action = new Actions(driver);
        columnsToSelect.forEach(columnName -> {
            action.dragAndDrop(driver.findElement(EditViewForm.getByObjectFromString(columnName)), driver.findElement(EditViewForm.emptySelectedColumn)).build().perform();
        });
    }
}


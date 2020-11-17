package components.columnDictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EditViewForm {
    public static By viewNameField = By.id("viewName");
    public static By selectAllColumnsButton = By.id("dbox_select_all");
    public static By deSelectAllColumnsButton = By.id("dbox_de_select_all");
    public static By availableColumns = By.xpath("//ul[@id='avaiableColumns']//span[@class='colName']");
    public static By selectedColumns = By.xpath("//ul[@id='selectedColumns']//span[@class='colName']");
}

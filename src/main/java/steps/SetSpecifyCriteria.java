package steps;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SetSpecifyCriteria {
    private WebDriver driver;

    public SetSpecifyCriteria(WebDriver driver) {
        this.driver = driver;
    }

    public void set(String columnToFilter, String filterName, String sourceToFilter) {

        if(columnToFilter.equals("Source")){
            Select filterColumnsDropdown = new Select(driver.findElement(EditViewForm.filterColumnsCriteria));
            filterColumnsDropdown.selectByVisibleText("Source");
        }
        if(filterName.equals("Includes")){
            Select filterOperatorDropdown = new Select(driver.findElement(EditViewForm.filterOperatorCriteria));
            filterOperatorDropdown.selectByVisibleText("Includes");
        }
        if(sourceToFilter.equals("Orcl_dvSum")){
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(Keys.BACK_SPACE);
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys("o");
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(Keys.ENTER);
        }
    }
}
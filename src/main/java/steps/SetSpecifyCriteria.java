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

        Select filterColumnsDropdown = new Select(driver.findElement(EditViewForm.filterColumnsCriteria));
        filterColumnsDropdown.selectByVisibleText(columnToFilter);

        Select filterOperatorDropdown = new Select(driver.findElement(EditViewForm.filterOperatorCriteria));
        filterOperatorDropdown.selectByVisibleText(filterName);

        Integer searchChoiceSelected = driver.findElements(EditViewForm.searchChoice).size();
        for(int i=0; i<searchChoiceSelected; i++){
            driver.findElement(EditViewForm.searchChoiceClose).click();
        }

        driver.findElement(EditViewForm.selectValuesCriteria).click();
        driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(sourceToFilter);
        driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(Keys.ENTER);
    }
}
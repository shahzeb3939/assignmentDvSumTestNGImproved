package steps;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SetSpecifyCriteria {
    private WebDriver driver;

    public SetSpecifyCriteria(WebDriver driver) {
        this.driver = driver;
    }

    public void set(List<String> specifyCriteria) {
        if(specifyCriteria.get(0).equals("Source")){
            Select filterColumnsDropdown = new Select(driver.findElement(EditViewForm.filterColumnsCriteria));
            filterColumnsDropdown.selectByVisibleText("Source");
        }
        if(specifyCriteria.get(1).equals("Includes")){
            Select filterOperatorDropdown = new Select(driver.findElement(EditViewForm.filterOperatorCriteria));
            filterOperatorDropdown.selectByVisibleText("Includes");
        }
        if(specifyCriteria.get(2).equals("Orcl_dvSum")){
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(Keys.BACK_SPACE);
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys("o");
            driver.findElement(EditViewForm.selectValuesCriteria).sendKeys(Keys.ENTER);
        }
    }
}
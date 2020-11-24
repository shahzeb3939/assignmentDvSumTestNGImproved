package steps;

import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import actions.*;

import java.util.List;

public class EditViewStep {
    private WebDriver driver;

    public EditViewStep(WebDriver driver){
        this.driver = driver;
    }

    public void gotoEditViewForm(String viewName){
        gotoPage();
        SelectViewFromViewControl selectViewFromViewControl = new SelectViewFromViewControl(driver);
        selectViewFromViewControl.selectView(viewName);
        OpenEditView openEditView = new OpenEditView(driver);
        openEditView.open();

    }

    private void gotoPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Navbar.appIcon));
        driver.get("https://devqa.dvsum.com/dictionary/column");
    }

    public void editView(String newViewName, String columnsToSelect, String specifyCriteria) {
        SetViewName setViewName = new SetViewName(driver);
        setViewName.set(newViewName);
        SetViewColumns setViewColumns = new SetViewColumns(driver);
        setViewColumns.set(columnsToSelect);
        SetSpecifyCriteria setSpecifyCriteria = new SetSpecifyCriteria(driver);
        setSpecifyCriteria.set(specifyCriteria);
        SaveEditedView saveEditedView = new SaveEditedView(driver);
        saveEditedView.save();
    }
}

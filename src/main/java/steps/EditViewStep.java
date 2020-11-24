package steps;

import org.openqa.selenium.WebDriver;
import actions.*;

public class EditViewStep {
    private WebDriver driver;

    public EditViewStep(WebDriver driver){
        this.driver = driver;
    }

    public void editView(String viewName, String newViewName, String columnsToSelect, String columnToFilter, String filterName, String sourceToFilter) {
        SelectViewFromViewControl selectViewFromViewControl = new SelectViewFromViewControl(driver);
        selectViewFromViewControl.selectView(viewName);
        OpenEditView openEditView = new OpenEditView(driver);
        openEditView.open();
        SetViewName setViewName = new SetViewName(driver);
        setViewName.set(newViewName);
        SetViewColumns setViewColumns = new SetViewColumns(driver);
        setViewColumns.set(columnsToSelect);
        SetSpecifyCriteria setSpecifyCriteria = new SetSpecifyCriteria(driver);
        setSpecifyCriteria.set(columnToFilter, filterName, sourceToFilter);
        SaveEditedView saveEditedView = new SaveEditedView(driver);
        saveEditedView.save();
    }
}

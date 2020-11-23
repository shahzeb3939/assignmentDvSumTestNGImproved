package tests;

import data.TestData;
import org.testng.annotations.Test;
import steps.EditViewStep;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EditViewTest extends TestData {

    @Test(dataProvider = "editViewTestDataProvider")
    public void editViewTest(String viewName, String newViewName, List<String> columnsToSelect, List<String> specifyCriteria){
        EditViewStep editViewStep = new EditViewStep(webDriver.getDriver());
        editViewStep.gotoEditViewForm(viewName);
        editViewStep.editView(newViewName, columnsToSelect, specifyCriteria);

//        CorrectSource correctSourceAssert = new CorrectSource(webDriver.getDriver());
//        assertTrue(correctSourceAssert.correctSource());
    }
}

package tests;

import data.TestData;
import org.testng.annotations.Test;
import steps.EditViewStep;
import testData.DataProviderClass;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EditViewTest extends BaseTest {

    @Test(dataProvider = "excelSheetData", dataProviderClass = DataProviderClass.class)
    public void editViewTest(Map<String, String> sheet){
        EditViewStep editViewStep = new EditViewStep(webDriver.getDriver());
        editViewStep.gotoEditViewForm(sheet.get("viewName"));
        editViewStep.editView(sheet.get("newViewName"), sheet.get("columnsToSelect"), sheet.get("specifyCriteria"));

//        CorrectSource correctSourceAssert = new CorrectSource(webDriver.getDriver());
//        assertTrue(correctSourceAssert.correctSource());
    }
}

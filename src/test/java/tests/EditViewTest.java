package tests;

import data.TestData;
import org.testng.annotations.Test;
import steps.assertions.CorrectSource;
import steps.wrappers.GotoColumnDictionaryPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EditViewTest extends TestData {

    @Test(dataProvider = "editViewTestDataProvider")
    public void editViewTest(String viewName, String newViewName, List<String> columnsToSelect, List<String> specifyCriteria){
        GotoColumnDictionaryPage gotoColumnDictionaryPage = new GotoColumnDictionaryPage(webDriver.getDriver());
        gotoColumnDictionaryPage.gotoEditViewForm(viewName);
        gotoColumnDictionaryPage.editView(newViewName, columnsToSelect, specifyCriteria);

        CorrectSource correctSourceAssert = new CorrectSource(webDriver.getDriver());
        assertTrue(correctSourceAssert.correctSource());
    }
}

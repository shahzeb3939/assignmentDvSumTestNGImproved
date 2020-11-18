package tests;

import data.TestData;
import org.testng.annotations.Test;
import steps.wrappers.GotoColumnDictionaryPage;

import java.util.List;

public class EditViewTest extends TestData {

    @Test(dataProvider = "editViewTestDataProvider")
    public void editViewTest(String viewName, String newViewName, List<String> columnsToSelect){
        GotoColumnDictionaryPage gotoColumnDictionaryPage = new GotoColumnDictionaryPage(webDriver.getDriver());
        gotoColumnDictionaryPage.gotoEditViewForm(viewName);
        gotoColumnDictionaryPage.editView(newViewName, columnsToSelect);
    }
}

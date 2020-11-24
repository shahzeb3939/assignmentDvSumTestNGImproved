package tests;

import org.testng.annotations.Test;
import steps.EditViewStep;
import steps.GotoPage;
import testData.DataProviderClass;

import java.util.Map;

public class EditViewTest extends BaseTest {

    @Test(dataProvider = "excelSheetData", dataProviderClass = DataProviderClass.class)
    public void editViewTest(Map<String, String> sheet) throws Exception {
        GotoPage gotoPage = new GotoPage(webDriver.getDriver());
        gotoPage.open("ColumnDictionaryPage");
        EditViewStep editViewStep = new EditViewStep(webDriver.getDriver());
        editViewStep.editView(sheet.get("viewName"), sheet.get("newViewName"), sheet.get("columnsToSelect"), sheet.get("columnToFilter"), sheet.get("filterName"), sheet.get("sourceToFilter"));
    }
}

package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.wrappers.GotoColumnDictionaryPage;

public class EditViewTest extends BaseTest {

    @Test
    public void editViewTest(){
        GotoColumnDictionaryPage gotoColumnDictionaryPage = new GotoColumnDictionaryPage(webDriver.getDriver());
        gotoColumnDictionaryPage.gotoEditViewForm("testView");
        gotoColumnDictionaryPage.editView("testViewEdited");
    }
}

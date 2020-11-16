package tests;

import org.testng.annotations.Test;
import steps.actions.GotoColumnDictionaryPage;

public class EditViewTest extends BaseTest {

    @Test
    public void editViewTest(){
        GotoColumnDictionaryPage gotoColumnDictionaryPage = new GotoColumnDictionaryPage(webDriver.getDriver());
        gotoColumnDictionaryPage.gotoPage();
    }
}

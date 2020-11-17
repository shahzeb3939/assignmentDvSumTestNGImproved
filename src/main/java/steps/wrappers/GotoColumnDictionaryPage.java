package steps.wrappers;

import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.actions.OpenEditView;
import steps.actions.SelectViewFromViewControl;
import steps.actions.SetViewColumns;
import steps.actions.SetViewName;

public class GotoColumnDictionaryPage {
    private WebDriver driver;

    public GotoColumnDictionaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void gotoEditViewForm(String view){
        gotoPage();
        SelectViewFromViewControl selectViewFromViewControl = new SelectViewFromViewControl(driver);
        selectViewFromViewControl.selectView(view);
        OpenEditView openEditView = new OpenEditView(driver);
        openEditView.open();

    }

    private void gotoPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Navbar.appIcon));
        driver.get("https://devqa.dvsum.com/dictionary/column");
    }

    public void editView(String newViewName) {
        SetViewName setViewName = new SetViewName(driver);
        setViewName.set(newViewName);
        SetViewColumns setViewColumns = new SetViewColumns(driver);
        setViewColumns.set();
    }
}
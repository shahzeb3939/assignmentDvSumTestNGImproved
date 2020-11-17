package steps.wrappers;

import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.actions.SelectViewFromViewControl;

public class GotoColumnDictionaryPage {
    private WebDriver driver;

    public GotoColumnDictionaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void editView(String view){
        gotoPage();
        SelectViewFromViewControl selectViewFromViewControl = new SelectViewFromViewControl(driver);
        selectViewFromViewControl.selectView(view);
    }

    private void gotoPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Navbar.appIcon));
        driver.get("https://devqa.dvsum.com/dictionary/column");
    }
}

package steps;

import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GotoPage {
    private WebDriver driver;

    public static String columnDictionaryPage = "https://devqa.dvsum.com/dictionary/column";
    public static String dvSumLoginPage = "https://devqa.dvsum.com/login";

    public GotoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String pageName) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Navbar.appIcon));
        driver.get(GotoPage.columnDictionaryPage);
    }
}

package steps;

import components.dashboard.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExcelUtils;

import java.util.List;
import java.util.Map;

public class GotoPage {
    private WebDriver driver;

    public GotoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String pageName) throws Exception {
        List<Map<String, String>> sheetValues = ExcelUtils.readSheet("resources/excelTestData.xlsx", "Pages");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Navbar.appIcon));
        driver.get(sheetValues.get(0).get(pageName));
    }
}

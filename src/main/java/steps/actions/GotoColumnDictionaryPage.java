package steps.actions;

import components.columnDictionary.ViewControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GotoColumnDictionaryPage {
    private WebDriver driver;
    private By dataCatalog = By.xpath("//span[contains(.,'Data Catalog')]");

    public GotoColumnDictionaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void gotoPage() {
        driver.findElement(dataCatalog).click();
        driver.get("https://devqa.dvsum.com/dictionary/column");
    }
}

package actions;

import components.columnDictionary.ViewControl;
import org.openqa.selenium.WebDriver;

public class SelectViewFromViewControl {
    private WebDriver driver;
    public SelectViewFromViewControl(WebDriver driver){
        this.driver = driver;
    }

    public void selectView(String viewName) {
        driver.findElement(ViewControl.dropdownView).click();
        driver.findElement(ViewControl.getByObjectFromString(viewName)).click();

//        driver.findElement().click();

//        UpdateViews updatedViews = new UpdateViews(driver);
//        for(WebElement item:updatedViews.viewsList){
//            if(item.getText().equals(viewName)){
//                item.click();
//            }
//        }
    }
}

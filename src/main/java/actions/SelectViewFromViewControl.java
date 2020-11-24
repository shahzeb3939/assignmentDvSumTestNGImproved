package actions;

import components.columnDictionary.ViewControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.UpdateViews;

public class SelectViewFromViewControl {
    private WebDriver driver;
    public SelectViewFromViewControl(WebDriver driver){
        this.driver = driver;
    }

    public void selectView(String viewName) {
        driver.findElement(ViewControl.dropdownView).click();
        driver.findElement(ViewControl.viewByObject(viewName)).click();

//        driver.findElement().click();

//        UpdateViews updatedViews = new UpdateViews(driver);
//        for(WebElement item:updatedViews.viewsList){
//            if(item.getText().equals(viewName)){
//                item.click();
//            }
//        }
    }
}

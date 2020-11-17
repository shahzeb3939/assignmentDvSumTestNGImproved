package steps.actions;

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
        UpdateViews updatedViews = new UpdateViews(driver);
        for(WebElement item:updatedViews.viewsList){
            System.out.println(item.getText());
            if(item.getText().equals(viewName)){
                System.out.println(item.getText()+":before click");
                item.click();
                System.out.println(item.getText()+":after click");
            }
        }
    }
}

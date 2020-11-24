package components.columnDictionary;

import org.openqa.selenium.By;

public class ViewControl {
    public static By dropdownView = By.id("selectedView");

    public static By viewByObject(String viewName){
        String byString = "//li[contains(@class,'userView')][normalize-space()='%s']";
        String formattedByString = String.format(byString, viewName);
        By viewNameByObject = By.xpath(formattedByString);
        return viewNameByObject;
    }
}



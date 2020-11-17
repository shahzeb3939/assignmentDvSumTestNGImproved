package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UpdateViews {
    private WebDriver driver;

    private By favouriteViews = By.cssSelector("#favouriteViews li");
    private By nonFavouriteViews = By.cssSelector("#viewsCreatedByme li");

    public List<WebElement> favouriteViewsList;
    public List<WebElement> nonFavouriteViewsList;
    public List<WebElement> viewsList;
    public List<String> favouriteViewsName;
    public List<String> nonFavouriteViewsName;
    public List<String> viewsName;

    public UpdateViews(WebDriver driver){
        this.driver = driver;
        updateViewsName();
    }

    private void updateFavouriteViewsList(){
        favouriteViewsList = driver.findElements(favouriteViews);
    }

    private void updateNonFavouriteViewsList(){
        nonFavouriteViewsList = driver.findElements(nonFavouriteViews);
    }

    private void updateViewsList(){
        updateFavouriteViewsName();
        updateNonFavouriteViewsName();
        viewsList = new ArrayList<WebElement>();
        viewsList.addAll(favouriteViewsList);
        viewsList.addAll(nonFavouriteViewsList);
    }

    private void updateFavouriteViewsName(){
        updateFavouriteViewsList();
        favouriteViewsName = new ArrayList<String>();
        for(WebElement listItem:favouriteViewsList){
            favouriteViewsName.add(listItem.getText());
        }
    }

    private void updateNonFavouriteViewsName(){
        updateNonFavouriteViewsList();
        nonFavouriteViewsName = new ArrayList<String>();
        for(WebElement listItem:nonFavouriteViewsList){
            nonFavouriteViewsName.add(listItem.getText());
        }
    }

    private void updateViewsName(){
        updateViewsList();
        viewsName = new ArrayList<String>();
        for(WebElement listItem:viewsList){
            viewsName.add(listItem.getText());
        }
    }
}

package assertions;

import components.columnDictionary.ViewGrid;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class CorrectSource {
    private WebDriver driver;
    private List<String> sourceTextList;
    private int sourceCount;

    public CorrectSource(WebDriver driver){
        this.driver = driver;
    }

    public boolean correctSource(){
        sourceTextList = new ArrayList<String>();
        sourceTextList.clear();
        for(int i=0; i<100; i++){
            String sourceTextFormatted = String.format(ViewGrid.sourceText, i);
            By sourceByLocator = By.xpath(sourceTextFormatted);
            WebElement sourceWebElement = driver.findElement(sourceByLocator);
            Point sourceWebElementLocation = sourceWebElement.getLocation();
            ((JavascriptExecutor)driver).executeScript("window.scrollTo(" + sourceWebElementLocation.getX() + ", " + sourceWebElementLocation.getY() + ')');
            sourceTextList.add(sourceWebElement.getText());
        }

        sourceCount = 0;
        sourceTextList.forEach((listItem)->{
            if(listItem.equals("Orcl_dvSum")){
                sourceCount+=1;
            }
        });

        System.out.println(sourceCount+" :count");

        if(sourceCount == 100){
            return true;
        } else {
            return false;
        }
    }
}

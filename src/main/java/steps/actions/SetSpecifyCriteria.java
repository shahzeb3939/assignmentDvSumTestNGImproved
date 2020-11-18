package steps.actions;

import components.columnDictionary.EditViewForm;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SetSpecifyCriteria {
    private WebDriver driver;

    public SetSpecifyCriteria(WebDriver driver) {
        this.driver = driver;
    }

    public void set(List<String> specifyCriteria) {
        if(specifyCriteria.get(0).equals("Source")){
            System.out.println("********************************************");
            System.out.println(driver.findElement(EditViewForm.filterColumnsCriteria).getText());
        }
        if(specifyCriteria.get(1).equals("Includes")){
            System.out.println("********************************************");
            System.out.println(driver.findElement(EditViewForm.filterOperatorCriteria).getText());
        }
        if(specifyCriteria.get(2).equals("Orcl_dvSum")){
            System.out.println("********************************************");
            System.out.println(driver.findElement(EditViewForm.selectValuesCriteria).getText());
        }
    }
}

//        System.out.println(specifyCriteria.get(0));
//        System.out.println(specifyCriteria.get(1));
//        System.out.println(specifyCriteria.get(2));
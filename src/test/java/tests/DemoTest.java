package tests;

import data.TestData;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoTest extends TestData {

    @Test(dataProvider = "demoTestDataProvider")
    public void demoTest(String first, String second, String third){
        System.out.println(second);
        System.out.println(third);
        System.out.println(first);
    }
}

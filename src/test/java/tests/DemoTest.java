package tests;

import data.TestData;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class DemoTest extends TestData {

    @Test(dataProvider = "demoTestDataProvider")
    public void demoTest(String first, List<String> second, String third){
        System.out.println(second.get(1));
        System.out.println(second.get(0));
        System.out.println(third);
        System.out.println(first);
    }
}

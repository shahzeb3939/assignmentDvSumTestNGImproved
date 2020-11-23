package tests;

import org.testng.annotations.Test;
import utils.ExcelUtils;

public class DemoTest {

    @Test
    public void demoTest() throws Exception {
        ExcelUtils.readSheet("C:/Users/Emumba/Desktop/randomData.xlsx", "Sheet1");

    }
}

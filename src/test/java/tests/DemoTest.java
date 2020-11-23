package tests;

import org.testng.annotations.Test;
import utils.ExcelUtils;

public class DemoTest {

    @Test
    public void demoTest() throws Exception {
        ExcelUtils.setExcelFile("C:/Users/Emumba/Desktop/randomData.xlsx", "Sheet1");
        System.out.println(ExcelUtils.getCellData(4, 1));
    }
}

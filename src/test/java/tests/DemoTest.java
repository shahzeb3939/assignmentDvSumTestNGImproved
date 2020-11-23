package tests;

import org.testng.annotations.Test;
import testData.DataProviderClass;
import utils.ExcelUtils;

import java.util.Map;

public class DemoTest {

    @Test(dataProvider = "excelSheetData", dataProviderClass = DataProviderClass.class)
    public void Sheet4(Map<String, String> sheet) throws Exception {
        System.out.println(sheet.get("userName"));
        System.out.println(sheet.get("password"));
    }
}

package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelUtils;

import java.lang.reflect.Method;
import java.util.*;

public class DataProviderClass {

    @DataProvider(name = "excelSheetData")
    public static Iterator<Object[]> getDataFromSheet(Method method) throws Exception {
        String testMethodName = method.getName();
        List<Map<String, String>> sheetValues =  ExcelUtils.readSheet("resources/excelTestData.xlsx", testMethodName);
        Collection<Object[]> data = new ArrayList<Object[]>();
        sheetValues.forEach(item -> data.add(new Object[]{item}));
        return data.iterator();
    }
}

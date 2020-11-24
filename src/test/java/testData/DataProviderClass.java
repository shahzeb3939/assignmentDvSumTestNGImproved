package testData;

import constants.Constants;
import org.testng.annotations.DataProvider;
import utils.ExcelUtils;

import java.lang.reflect.Method;
import java.util.*;

public class DataProviderClass {

    @DataProvider(name = "excelSheetData")
    public static Iterator<Object[]> getDataFromSheet(Method method) throws Exception {
        String testMethodName = method.getName();
        List<Map<String, String>> sheetValues =  ExcelUtils.readSheet(Constants.excelTestDataFilePath, testMethodName);
        Collection<Object[]> data = new ArrayList<Object[]>();
        sheetValues.forEach(item -> data.add(new Object[]{item}));
        return data.iterator();
    }
}

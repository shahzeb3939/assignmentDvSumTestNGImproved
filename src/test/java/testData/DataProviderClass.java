package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelUtils;

import java.lang.reflect.Method;
import java.util.Iterator;

public class DataProviderClass {

    @DataProvider
    public static Iterator<Object[]> getDataFromSheet(Method method) throws Exception {
        return null;
    }
}

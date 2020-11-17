package data;

import org.testng.annotations.DataProvider;
import tests.BaseTest;

public class TestData extends BaseTest {

    @DataProvider(name = "demoTestDataProvider")
    public Object[][] demoTestData() {
        Object[][] data = new Object[2][3];

        data[0][0] = "firstTest_firstColumn";
        data[0][1] = "firstTest_secondColumn";
        data[0][2] = "firstTest_thirdColumn";

        data[1][0] = "secondTest_firstColumn";
        data[1][1] = "secondTest_secondColumn";
        data[1][2] = "secondTest_thirdColumn";
        return data;
    }
}

package data;

import org.testng.annotations.DataProvider;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    @DataProvider(name = "editViewTestDataProvider")
    public Object[][] editViewTestData(){
        Object[][] data = new Object[1][4];

        List<String> columnsToSelect = new ArrayList<String>();
        List<String> specifyCriteria = new ArrayList<String>();

        columnsToSelect.add("Primary Key");
        columnsToSelect.add("Density");
        columnsToSelect.add("Count Blanks");
        columnsToSelect.add("Profile Status");
        columnsToSelect.add("Source");
        columnsToSelect.add("Entity Type");
        columnsToSelect.add("Length");
        columnsToSelect.add("User Description");
        columnsToSelect.add("Source Type");
        columnsToSelect.add("Column");
        columnsToSelect.add("Distribution Type");
        columnsToSelect.add("Column Type");
        columnsToSelect.add("Min Value");
        columnsToSelect.add("Foreign Key");
        columnsToSelect.add("Sensitivity Level");

        specifyCriteria.add("Source");
        specifyCriteria.add("Includes");
        specifyCriteria.add("Orcl_dvSum");

        data[0][0] = "Test_Cloned";
        data[0][1] = "Test_Cloned_Edited";
        data[0][2] = columnsToSelect;
        data[0][3] = specifyCriteria;

        return data;
    }
}

package utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtils {

    public static List<Map<String, String>> readSheet(String path, String sheetName) throws Exception {
        try {
            FileInputStream excelFile = new FileInputStream(path);
            XSSFWorkbook excelWBook = new XSSFWorkbook(excelFile);
            XSSFSheet excelWSheet = excelWBook.getSheet(sheetName);

            List<Map<String, String>> sheetValues = new ArrayList<Map<String, String>>();

            XSSFRow keyRow = excelWSheet.getRow(0);

            for(int row=1; row<excelWSheet.getLastRowNum()+1; row++){
                Map<String, String> hashMap = new HashMap<String, String>();
                for(int col=0; col<keyRow.getLastCellNum(); col++){
                    hashMap.put(keyRow.getCell(col).toString(), excelWSheet.getRow(row).getCell(col).toString());
                }
                sheetValues.add(hashMap);
            }

            return sheetValues;


        } catch (Exception e) {
            throw (e);
        }
    }
}

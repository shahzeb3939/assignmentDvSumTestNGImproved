package utils;

import java.util.Arrays;
import java.util.List;

public class StringToList {
    public static List<String> convertToList(String givenString){
        String[] givenStringArray = givenString.split(", ");
        List<String> givenStringList = Arrays.asList(givenStringArray);
        return givenStringList;
    }
}

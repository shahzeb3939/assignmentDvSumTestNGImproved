package tests;

import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void demoTest(){
        String randomString = "this %s print %d the %f %s string";
//        System.out.println(randomString);
//        String formatted = String.format(randomString, "should", "olfool");
//        System.out.println(formatted);
        System.out.printf(randomString, "shoddcc", 32, 99.24, "nono");
    }
}

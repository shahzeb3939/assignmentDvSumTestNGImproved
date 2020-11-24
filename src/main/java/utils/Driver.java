package utils;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;

    public Driver(){
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverFilePath);
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }
}

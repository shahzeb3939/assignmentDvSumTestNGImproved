package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import utils.Driver;
import utils.Login;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected Driver webDriver;

    @BeforeClass
    public void setUp(){
        webDriver = new Driver();
        webDriver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login login = new Login();
        login.loginDvSum(webDriver.getDriver());
    }

    @AfterClass
    public void tearDown(){
    }
}

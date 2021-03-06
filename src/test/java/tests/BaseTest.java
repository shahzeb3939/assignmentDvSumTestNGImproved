package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Driver;
import steps.Login;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected Driver webDriver;

    @BeforeClass
    public void setUp() throws Exception {
        webDriver = new Driver();
        webDriver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Login login = new Login();
        login.loginDvSum(webDriver.getDriver());
    }

    @AfterClass
    public void tearDown(){
        webDriver.getDriver().quit();
    }
}

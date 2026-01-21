package tests;

import tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DriverFactory;

public class LoginTest extends BaseTest{

    @Test
    public void openHomePageTest(){
        DriverFactory.getDriver().get("https://automationexercise.com");
        String title = DriverFactory.getDriver().getTitle();
        Assert.assertTrue(title.contains("Automation"));
    }
}

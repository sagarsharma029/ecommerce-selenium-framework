package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DriverFactory;
import pages.LoginPage;
import pages.HomePage;

public class LoginTest extends BaseTest{

    @Test
    public void invalidLoginTest(){
        DriverFactory.getDriver().get("https://automationexercise.com");

        HomePage home = new HomePage(DriverFactory.getDriver());
        home.clickSignupLogin();

        LoginPage login = new LoginPage(DriverFactory.getDriver());
        login.login("invalid@email.com", "wrongpassword");

        Assert.assertTrue(
                login.isLoginErrorDisplayed(),
                "Error message not shown for invalid login"
        );
    }
}

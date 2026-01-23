package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utils.DriverFactory;

public class SignupTest extends BaseTest {

    @Test
    public void userSignupTest(){
        DriverFactory.getDriver().get("https://automationexercise.com");

        HomePage home = new HomePage(DriverFactory.getDriver());
        home.clickSignupLogin();

        LoginPage login = new LoginPage(DriverFactory.getDriver());

        String email = "user_" + Math.random() + "@email.com";
        login.signup("Test User", email);

        SignupPage signup = new SignupPage(DriverFactory.getDriver());
        signup.fillAccountDetails();

        Assert.assertTrue(
                DriverFactory.getDriver().getPageSource().contains("Account Created!"),
                "Sign up failed."
        );
    }
}

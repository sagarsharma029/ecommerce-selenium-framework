package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverFactory;

public class EndToEndTest extends BaseTest {

    @Test
    public void completeOrderTest() {

        DriverFactory.getDriver().get("https://automationexercise.com");

        HomePage home = new HomePage(DriverFactory.getDriver());
        home.clickSignupLogin();

        LoginPage login = new LoginPage(DriverFactory.getDriver());
        login.login("endtoend@test.com", "test123");

        Assert.assertTrue(home.isUserLoggedIn(), "User not logged in successfully");

        DriverFactory.getDriver().findElement(
                org.openqa.selenium.By.partialLinkText("Products")).click();

        ProductsPage products = new ProductsPage(DriverFactory.getDriver());
        products.addFirstProductToCart();
        products.goToCart();

        CartPage cart = new CartPage(DriverFactory.getDriver());
        Assert.assertEquals(cart.getProductQuantity(), "1");

        cart.proceedToCheckout();

        CheckoutPage checkout = new CheckoutPage(DriverFactory.getDriver());
        checkout.placeOrder("Please deliver fast");

        Assert.assertTrue(
                DriverFactory.getDriver().getPageSource().contains("ORDER PLACED"),
                "Order was not placed successfully"
        );
    }
}
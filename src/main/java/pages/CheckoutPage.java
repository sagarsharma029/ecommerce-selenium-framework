package pages;

import base.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver){
        super(driver);
    }

    @FindBy(name="message")
    private WebElement commentBox;

    @FindBy(xpath = "//a[text='Place Order']")
    private WebElement placeOrderBtn;

    public void placeOrder(String comment){
        commentBox.sendKeys(comment);
        placeOrderBtn.click();
    }
}

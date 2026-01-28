package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css=".cart_quantity")
    private WebElement quantity;

    @FindBy(linkText = "Proceed To Checkout")
    private WebElement checkoutBtn;

    public String getProductQuantity(){
        return quantity.getText();
    }

    public void proceedToCheckout(){
        checkoutBtn.click();
    }
}

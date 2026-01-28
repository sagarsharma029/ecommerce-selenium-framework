package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    private WebElement firstProductAddToCart;

    @FindBy(xpath = "//button[text()= 'Continue Shopping']")
    private WebElement continueShoppingBtn;

    @FindBy(xpath="//u[text()='View Cart']")
    private WebElement viewCartLink;

    public void addFirstProductToCart(){
        firstProductAddToCart.click();
        continueShoppingBtn.click();
    }

    public void goToCart(){
        viewCartLink.click();
    }

}

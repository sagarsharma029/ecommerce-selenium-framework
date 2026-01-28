package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_gender1")
    private WebElement titleMr;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountBtn;

    @FindBy(css = "a[data-qa='continue-button']")
    private WebElement continueBtn;

    public void fillAccountDetails() {

        titleMr.click();
        password.sendKeys("Password@123");
        new Select(days).selectByValue("10");
        new Select(months).selectByValue("5");
        new Select(years).selectByValue("1995");
        firstName.sendKeys("Sagar");
        lastName.sendKeys("Sharma");
        address.sendKeys("Test Address");
        state.sendKeys("Delhi");
        city.sendKeys("Delhi");
        zipCode.sendKeys("110001");
        mobileNumber.sendKeys("9876543210");

        createAccountBtn.click();
        continueBtn.click();
    }
}
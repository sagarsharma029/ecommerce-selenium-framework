package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Signup / Login")
    private WebElement signupLoginLink;

    @FindBy(css = "a[href='/products']")
    private WebElement productsLink;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAsText;

    public void clickSignupLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginLink)).click();
    }

    public boolean isUserLoggedIn() {
        return loggedInAsText.isDisplayed();
    }

    public void handleAdsIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // switch to iframe if exists
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

            // try clicking close or dismiss button
            driver.findElement(By.id("dismiss-button")).click();

            driver.switchTo().defaultContent();
            System.out.println("Ad closed.");
        } catch (Exception e) {
            driver.switchTo().defaultContent();
            System.out.println("No ad displayed.");
        }
    }

    public void clickProducts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until user is logged in
        wait.until(ExpectedConditions.visibilityOf(loggedInAsText));

        handleAdsIfPresent();

        // Wait until Products link clickable
        wait.until(ExpectedConditions.elementToBeClickable(productsLink));

        productsLink.click();
    }
}
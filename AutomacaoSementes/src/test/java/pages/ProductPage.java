package pages;

import org.openqa.selenium.By;
import utils.Tools;

public class ProductPage {

    public Tools driver;

    public ProductPage(Tools driver) {
        this.driver = driver;
    }

    public static final String APPLE_MONITOR_TITLE = "//h2[text()='Apple monitor 24']";
    public static final String APPLE_ADD_TO_CART_BTN = "//a[text()='Add to cart']";
    public static final String CART_BTN = "cartur";

    public void waitForAppleTitle() {
        driver.waitForElement(By.xpath(APPLE_MONITOR_TITLE), 10);
    }

    public void clickAddToCart() {
        driver.click(By.xpath(APPLE_ADD_TO_CART_BTN), 10);
    }

    public void clickAlertBox() {
        driver.handleAlert(10);
    }

    public void clickOnCart() {
        driver.click(By.id(CART_BTN), 10);
    }
}

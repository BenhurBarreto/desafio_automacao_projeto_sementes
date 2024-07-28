package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Tools;
import utils.ExtentReportUtil;

import java.util.List;

public class CartPage {

    public Tools driver;

    public CartPage(Tools driver) {
        this.driver = driver;
    }

    public static final String PRODUCTS_TITLE = "//h2[text()='Products']";
    public static final String PRODUCST_TABLE_QUANTITY = "//tbody/tr";
    public static final String TOTAL_INDICATOR = "totalp";
    public static final String PLACE_ORDER_BTN = "//button[text()='Place Order']";

    public void waitForProductTitle() {
        driver.waitForElement(By.xpath(PRODUCTS_TITLE), Tools.getTimeout());
        ExtentReportUtil.logPass("Product title is displayed");
    }

    public void countQuantityOfProducts() {
        List<WebElement> products = driver.findElements(By.xpath(PRODUCST_TABLE_QUANTITY), Tools.getTimeout());
        Assertions.assertNotNull(products, "The list of products should not be null.");
        int actualCount = products.size();
        int expectedCount = Integer.parseInt(Tools.getProperty("quantity"));
        Assertions.assertEquals(expectedCount, actualCount, "The number of products in the cart is incorrect.");
        ExtentReportUtil.logPass("Product quantity is correct");
    }

    public void verifyTotal() {
        String value = driver.getText(By.id(TOTAL_INDICATOR), Tools.getTimeout());
        Assertions.assertEquals(Tools.getProperty("appleMonitorValue"), value, "The total differs from the expected.");
    }

    public void clickOnPlaceOrder() {
        driver.click(By.xpath(PLACE_ORDER_BTN), Tools.getTimeout());
    }
}

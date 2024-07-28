package pages;

import org.openqa.selenium.By;
import utils.ExtentReportUtil;
import utils.Tools;

public class LandingPage {

    public Tools driver;

    public LandingPage(Tools driver) {
        this.driver = driver;
    }

    private static final String CATEGORY_MONITORS_XPATH = "//a[text()='Monitors']";
    private static final String PRODUCT_APPLE_MONITOR = "//a[text()='Apple monitor 24']";

    public void waitForCategory(int seconds) {
        driver.waitForElement(By.xpath(CATEGORY_MONITORS_XPATH), seconds);
        ExtentReportUtil.logPass("Product category is displayed");
    }

    public void clickCategory() {
        driver.click(By.xpath(CATEGORY_MONITORS_XPATH), Tools.getTimeout());
        ExtentReportUtil.logPass("Product category is clicked");
    }

    public void waitForAppleMonitor() {
        driver.waitForElement(By.xpath(PRODUCT_APPLE_MONITOR), Tools.getTimeout());
        ExtentReportUtil.logPass("Product is displayed");
    }

    public void clickOnAppleMonitor() {
        driver.click(By.xpath(PRODUCT_APPLE_MONITOR), Tools.getTimeout());
        ExtentReportUtil.logPass("Click on Product");
    }
}

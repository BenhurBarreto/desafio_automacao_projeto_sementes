package pages;

import org.openqa.selenium.By;
import utils.Tools;

public class PlaceOrderModal {

    public Tools driver;

    public PlaceOrderModal(Tools driver) {
        this.driver = driver;
    }

    public final String MODAL_TITLE = "//h5[@id='orderModalLabel']";
    public final String INPUT_NAME = "name";
    public final String INPUT_COUNTRY = "country";
    public final String INPUT_CITY = "city";
    public final String INPUT_CARD = "card";
    public final String INPUT_MONTH = "month";
    public final String INPUT_YEAR = "year";
    public final String PURCHASE_BUTTON = "//button[text()='Purchase']";
    public final String SUCCESS_MESSAGE = "//h2[text()='Thank you for your purchase!']";
    public final String OK_SUCCESS_BUTTON = "//button[text()='OK']";

    public void waitModalTitle() {
        driver.waitForElement(By.xpath(MODAL_TITLE), Tools.getTimeout());
    }

    public void inputName() {
        driver.sendKeys(By.id(INPUT_NAME), Tools.getProperty("name"), Tools.getTimeout());
    }

    public void inputCountry() {
        driver.sendKeys(By.id(INPUT_COUNTRY), Tools.getProperty("country"), Tools.getTimeout());
    }

    public void inputCity() {
        driver.sendKeys(By.id(INPUT_CITY), Tools.getProperty("city"), Tools.getTimeout());
    }

    public void inputCard() {
        driver.sendKeys(By.id(INPUT_CARD), Tools.getProperty("card"), Tools.getTimeout());
    }

    public void inputMonth() {
        driver.sendKeys(By.id(INPUT_MONTH), Tools.getProperty("month"), Tools.getTimeout());
    }

    public void inputYear() {
        driver.sendKeys(By.id(INPUT_YEAR), Tools.getProperty("year"), Tools.getTimeout());
    }

    public void clickPurchaseButton() {
        driver.click(By.xpath(PURCHASE_BUTTON), Tools.getTimeout());
    }

    public void waitSuccessMessage() {
        driver.waitForElement(By.xpath(SUCCESS_MESSAGE), Tools.getTimeout());
    }

    public void clickOnOkSuccessScreen() {
        driver.click(By.xpath(OK_SUCCESS_BUTTON), Tools.getTimeout());
    }
}

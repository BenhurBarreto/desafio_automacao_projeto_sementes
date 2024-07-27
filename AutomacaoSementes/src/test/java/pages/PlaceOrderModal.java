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
        driver.waitForElement(By.xpath(MODAL_TITLE), 10);
    }

    public void inputName() {
        driver.sendKeys(By.id(INPUT_NAME), "Neil Peart", 10);
    }

    public void inputCountry() {
        driver.sendKeys(By.id(INPUT_COUNTRY), "Canada", 10);
    }

    public void inputCity() {
        driver.sendKeys(By.id(INPUT_CITY), "Toronto", 10);
    }

    public void inputCard() {
        driver.sendKeys(By.id(INPUT_CARD), "4963258712340124", 10);
    }

    public void inputMonth() {
        driver.sendKeys(By.id(INPUT_MONTH), "August", 10);
    }

    public void inputYear() {
        driver.sendKeys(By.id(INPUT_YEAR), "2024", 10);
    }

    public void clickPurchaseButton() {
        driver.click(By.xpath(PURCHASE_BUTTON), 10);
    }

    public void waitSuccessMessage() {
        driver.waitForElement(By.xpath(SUCCESS_MESSAGE), 10);
    }

    public void clickOnOkSuccessScreen() {
        driver.click(By.xpath(OK_SUCCESS_BUTTON), 10);
    }
}

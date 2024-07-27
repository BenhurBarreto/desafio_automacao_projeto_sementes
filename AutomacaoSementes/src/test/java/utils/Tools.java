package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class Tools {

    public static WebDriver driver;
    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = Tools.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.err.println("Sorry, unable to find config.properties");
            } else {
                properties.load(input);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Tools(WebDriver driver) {
        Tools.driver = driver;
    }

    public void openBrowser(String url) {
        driver.get(url);
    }

    public void click(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        } catch (Exception e) {
            System.err.println("Failed to click on element: " + e.getMessage());
            throw new RuntimeException("Failed to click on element: " + e.getMessage());
        }
    }

    public void sendKeys(By locator, String text, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            System.err.println("Failed to send keys to element: " + e.getMessage());
            throw new RuntimeException("Failed to send keys to element: " + e.getMessage());
        }
    }

    public String getText(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        } catch (Exception e) {
            System.err.println("Failed to get text from element: " + e.getMessage());
            throw new RuntimeException("Failed to get text from element: " + e.getMessage());
        }
    }

    public void waitForElement(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.err.println("Failed to wait for element: " + e.getMessage());
            throw new RuntimeException("Failed to wait for element: " + e.getMessage());
        }
    }

    public void handleAlert(int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (Exception e) {
            System.err.println("Failed to handle alert: " + e.getMessage());
            throw new RuntimeException("Failed to handle alert: " + e.getMessage());
        }
    }

    public void waitForTextToBePresent(By locator, int seconds, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
        } catch (Exception e) {
            System.err.println("Failed to wait for text to be present in element: " + e.getMessage());
            throw new RuntimeException("Failed to wait for text to be present in element: " + e.getMessage());
        }
    }

    public List<WebElement> findElements(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        try {
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        } catch (Exception e) {
            System.err.println("Failed to find elements: " + e.getMessage());
            throw new RuntimeException("Failed to find elements: " + e.getMessage());
        }
    }

    public void quit() {
        driver.quit();
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout", "10"));
    }
}

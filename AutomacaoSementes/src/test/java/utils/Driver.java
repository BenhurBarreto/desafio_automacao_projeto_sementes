package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static Tools driverInstance;

    public static Tools getDriver() {
        if (driverInstance == null) {
            WebDriver webDriver = new ChromeDriver();
            driverInstance = new Tools(webDriver);
        }
        return driverInstance;
    }

    public static void quitDriver() {
        if (driverInstance != null) {
            driverInstance.quit();
            driverInstance = null;
        }
    }
}

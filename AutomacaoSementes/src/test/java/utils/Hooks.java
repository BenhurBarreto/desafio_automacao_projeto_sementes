package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hooks {

    private Driver driver;

    @Before
    public void setup() {
        driver = new Driver();
        driver.openUrl("https://www.demoblaze.com/index.html");
    }

    @After
    public void teardown() {
        driver.getDriver().quit();
    }
}

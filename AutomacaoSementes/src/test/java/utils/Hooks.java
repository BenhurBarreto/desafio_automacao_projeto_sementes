package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        Tools driver = Driver.getDriver();
        String url = "https://www.demoblaze.com/index.html";
        driver.openBrowser(url);
    }

    @After
    public void teardown() {
        Driver.quitDriver();
    }
}

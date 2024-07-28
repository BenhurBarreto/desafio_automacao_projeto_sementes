package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setup() {
        Tools driver = Driver.getDriver();
        String url = Tools.getProperty("url");
        driver.openBrowser(url);
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentReportUtil.startTest(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentReportUtil.logFail("Scenario failed: " + scenario.getName());
        } else {
            ExtentReportUtil.logPass("Scenario passed: " + scenario.getName());
        }
        Driver.quitDriver();
        ExtentReportUtil.tearDown();
    }
}

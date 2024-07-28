package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtil {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static void setupExtentReport() {
        if (extent == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
            sparkReporter.config().setDocumentTitle("Automation Report");
            sparkReporter.config().setReportName("Test Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
    }

    public static void startTest(String testName) {
        if (extent == null) {
            setupExtentReport();
        }
        test = extent.createTest(testName);
    }

    public static void logPass(String details) {
        if (test != null) {
            test.pass(details);
        }
    }

    public static void logFail(String details) {
        if (test != null) {
            test.fail(details);
        }
    }

    public static void tearDown() {
        if (extent != null) {
            extent.flush();
        }
    }
}

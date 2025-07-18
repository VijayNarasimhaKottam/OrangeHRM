package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	ExtentSparkReporter reporter = new ExtentSparkReporter("reports/OrangeHRMReport.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
            reporter.config().setReportName("OrangeHRM Automation Report");
            reporter.config().setDocumentTitle("Test Results");
        }
        return extent;
    }
}
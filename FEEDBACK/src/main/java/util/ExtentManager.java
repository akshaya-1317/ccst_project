package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        String fileName = System.getProperty("user.dir") + "/reports/TestReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setReportName("C-DAC Feedback System Results");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Automation User");
        
        return extent;
    }
}

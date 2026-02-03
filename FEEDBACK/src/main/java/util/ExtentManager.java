package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    //METHOD TO CREATE AND CONFIGURE REPORT INSTANCE
    public static ExtentReports createInstance() {
    	//SETS THE SAVE PATH
        String fileName = System.getProperty("user.dir") + "/reports/TestReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        
        //CONFIGURATION SETTINGS FOR HTML UI
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setReportName("C-DAC Feedback System Results");

        //INITIALIZES THE MAIN EXTENT REPORT OBJECT
        extent = new ExtentReports();
        //
        extent.attachReporter(sparkReporter);
        
        //ADDS CUSTOM  KEY-VALUE PAIRS TO REPORT'S DASHBOARD AND SUMMARY
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Automation User");
        
        return extent;
    }
}

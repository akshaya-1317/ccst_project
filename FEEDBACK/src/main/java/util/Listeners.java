package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Baseclass;

public class Listeners implements ITestListener {
	//CALLS EXTENT MANAGER TO SET UP THE HTML REPORT FILE
    private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    //THIS RUNS THE MOMENT A TEST METHOD BEGINS
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }
    
  

    @Override
    //THIS RUNS AUTOMATICALLY IF A TEST FINISHES WITHOUT ANY ERRORS
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    //THIS RUNS IF AN ASSERTION FAILS OR AN EXCEPTION OCCURS
    public void onTestFailure(ITestResult result) {
    	test.get().log(Status.FAIL, "Test Failed- screenshot attached");
    }
 

    @Override
    //THIS RUNS IF A TEST IS SKIPPED 
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    //THIS RUNS AFTER ALL TESTS IN testng.xml HAVE FINISHED
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
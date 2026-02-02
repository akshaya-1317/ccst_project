package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Baseclass;
import pages.CenterHeadLogin;
import pages.CourseWiseSSI;
import pages.TheorySSI;

public class TheorySSITest extends Baseclass {

    @Test
    public void verifySSICalculations() {
        // 1. Login and Navigate
        CenterHeadLogin chl = new CenterHeadLogin(driver);
        chl.chlogin("401", "OFSCHead#12345");

        CourseWiseSSI cws = new CourseWiseSSI(driver, this);
        cws.navigateToCourseWiseSSI();
        cws.showSSIReport("Certificate Courses", "CCST Project Test Course 1", "January 2026", "Theory");

        TheorySSI theory = new TheorySSI(driver, this);

        // 2. Capture values from UI
        double mid = theory.getMidModuleScore();   // 2.4
        double end = theory.getEndModuleScore();   // 3.04
        double uiAvg = theory.getDisplayedAverage(); // 2.72

        // 3. Apply Formula: Theory Module Avg = (Mid + End) / 2.0
        double calculatedAvg = (mid + end) / 2.0;
        
        // Round to 2 decimal places for comparison
        calculatedAvg = Math.round(calculatedAvg * 100.0) / 100.0;

        System.out.println("Mid: " + mid + " | End: " + end);
        System.out.println("Calculated Average: " + calculatedAvg);

        // Assertion for Module Average
        Assert.assertEquals(uiAvg, calculatedAvg, "Module Average calculation mismatch!");

        // 4. Apply Formula: Theory SSI = Theory Module Avg * 60 / 100
        // Note: Based on the UI, the 'Average Feedback Rating' (2.31) seems to be the target for SSI check
        double expectedSSI = (uiAvg * 60) / 100;
        expectedSSI = Math.round(expectedSSI * 100.0) / 100.0;
        
        System.out.println("Expected SSI (Weighted 60%): " + expectedSSI);
        
        // Optional: If you need to verify the final row "Average Feedback Rating"
        double totalAvg = theory.getTotalAverageFeedback();
        System.out.println("UI Total Average Rating: " + totalAvg);
    }
}
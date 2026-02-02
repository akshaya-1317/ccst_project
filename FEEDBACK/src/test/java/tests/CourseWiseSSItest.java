package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.CourseWiseSSI;

public class CourseWiseSSItest extends Baseclass {
	
	@Test
	public void verifyCourseWiseSSIReport() {
		CenterHeadLogin chl = new CenterHeadLogin(driver);
        chl.chlogin("401", "OFSCHead#12345");
        
        
        CourseWiseSSI cws = new CourseWiseSSI(driver, this);
        
        cws.navigateToCourseWiseSSI();
        
        cws.showSSIReport("Certificate Courses", "CCST Project Test Course 1", "January 2026", "Theory");
        
        
        
        cws.showSSIReport("Certificate Courses", "CCST Project Test Course 1", "January 2026", "Lab");
        
        System.out.println("SSI report successful");
        
        
	}
}

package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.CourseWiseSSI;

public class CourseWiseSSItest extends Baseclass {
	
			//TEST : VERIFY COURSEWISE SSI REPORT
			//MADE BY : AKSHAYA KULKARNI
	@Test
	public void verifyCourseWiseSSIReport() {
		//LOGIN
		CenterHeadLogin chl = new CenterHeadLogin(driver);
        chl.chlogin("401", "OFSCHead#12345");
        
        //OBJECT OF JAVA FILE
        CourseWiseSSI cws = new CourseWiseSSI(driver, this);
        
        //NAVIGATE METHOD CALL
        cws.navigateToCourseWiseSSI();
        
        //PARAMETERS
        cws.showSSIReport("Certificate Courses", "CCST Project Test Course 1", "January 2026", "Theory");
        cws.showSSIReport("Certificate Courses", "CCST Project Test Course 1", "January 2026", "Lab");
        
        System.out.println("SSI report successful");
        
        
	}
}

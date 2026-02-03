package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.CenterwiseFeedbackDetails;

public class CenterwiseFeedbackdetailsTest extends Baseclass {
	
		//TEST : VERIFY CENTERWISE FEEDBACK DETAILS
		//MADE BY : AKSHAYA KULKARNI
	@Test
	public void verifyCenterwiseFeedbackDetails() {
		//LOGIN
		CenterHeadLogin chl =  new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
	
	//OBJECT FOR JAVA FILE
	CenterwiseFeedbackDetails cfd = new CenterwiseFeedbackDetails(driver, this);
	cfd.navigateToCenterwiseFeedback();
	
	//PASSING PARAMETERS
	cfd.centerwiseFeedbackDetails("Certificate Courses", "CCST Project Test Course 1", "January 2026");
	System.out.println("Centerwise feedback details selected successfully.");
	
	}
}

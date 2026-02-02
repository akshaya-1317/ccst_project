package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.CenterwiseFeedbackDetails;

public class CenterwiseFeedbackdetailsTest extends Baseclass {
	
	
	@Test
	public void verifyCenterwiseFeedbackDetails() {
		CenterHeadLogin chl =  new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
	
	
	CenterwiseFeedbackDetails cfd = new CenterwiseFeedbackDetails(driver, this);
	cfd.navigateToCenterwiseFeedback();
	
	cfd.centerwiseFeedbackDetails("Certificate Courses", "CCST Project Test Course 1", "January 2026");
	System.out.println("Centerwise feedback details selected successfully.");
	
	}
}

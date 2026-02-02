package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.ViewCourseCoordinator;

public class ViewCCtests extends Baseclass {
	
	@Test
	public void verifyViewCCoordinator() {
		CenterHeadLogin chl = new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
		
		ViewCourseCoordinator vcc = new ViewCourseCoordinator(driver);
		vcc.viewCCoordinator();
	}
}

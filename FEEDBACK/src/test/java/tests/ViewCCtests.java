package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.ViewCourseCoordinator;

public class ViewCCtests extends Baseclass {
	
	//TEST : VERIFY VIEW COURSE COORDINATOR
	//MADE BY : AKSHAYA KULKARNI
	@Test
	public void verifyViewCCoordinator() {
		//LOGIN
		CenterHeadLogin chl = new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
		
		//OBJECT FROM JAVA
		ViewCourseCoordinator vcc = new ViewCourseCoordinator(driver);
		//METHOD CALL
		vcc.viewCCoordinator();
		System.out.println("View course coordinator functioned viewed cc");
	}
}

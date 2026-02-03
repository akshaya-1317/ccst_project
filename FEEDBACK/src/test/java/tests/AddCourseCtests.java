package tests;

import org.testng.annotations.Test;
import base.Baseclass;
import pages.CenterHeadLogin;
import pages.AddCourseCoordinator;


public class AddCourseCtests extends Baseclass {
	
	//TEST : VERIFY ADD COORDINATOR
	//MADE BY : AKSHAYA KULKARNI
	@Test
	public void verifyAddCoordinator() throws InterruptedException {
		//LOGIN 
		CenterHeadLogin chl = new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
		

		Thread.sleep(4000);
		//OBJECT OF JAVA FILE
		AddCourseCoordinator acc = new AddCourseCoordinator(driver);
		acc.navigateToAddCoordinator();
		
		Thread.sleep(4000);
		
		//PARAMETERS PASSED
		acc.fillCoordinatorDetails("Akshaya Vaidya2", "akshayakulkarni1998@gmail.com", "0222561060", "9067015107");
		System.out.println("Added course coordinator");
		
		

	}
	
	
	
	
	
	
}

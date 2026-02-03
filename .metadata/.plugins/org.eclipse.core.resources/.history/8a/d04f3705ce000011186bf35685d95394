package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.AssignCc;
import pages.CenterHeadLogin;

public class AssignCctest extends Baseclass {
	
	@Test
	public void verifyAssignCoordinator() throws InterruptedException {
		CenterHeadLogin chl =  new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
		
		AssignCc assignPage = new AssignCc(driver, this);
		assignPage.navigateToAssignCoordinator();
		
		Thread.sleep(10);
		assignPage.fillAssignmentForm(
	            "Certificate Courses", 
	            "January 2026", 
	            "Mrunali Meshram", 
	            "CCST Project Test Course 2"
	        );
		
		Thread.sleep(10);
		assignPage.submitAssignment();
		
		System.out.println("Course coordinator and courses aassigned successfully");
		
	}
}

package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.CenterHeadLogin;
import pages.ViewCoursePlan;

public class ViewCoursePlanTest extends Baseclass {
	
	
	//TEST : VERIFY COURSE PLAN
	//MADE BY : AKSHAYA KULKARNI
	@Test
	public void verifyCoursePlan() throws InterruptedException {
		
		//LOGIN
		CenterHeadLogin chl =  new CenterHeadLogin(driver);
		chl.chlogin("401", "OFSCHead#12345");
		
		//OBJECT FROM JAVA
		ViewCoursePlan cp = new ViewCoursePlan(driver, this);
		cp.navigateToViewCoursePlan();
		
		//PARAMETERS
		cp.selectCoursePlan("Certificate Courses", "CCST Project Test Course 1");
		System.out.println("first 2 fields filled");
		
		cp.selectCoursePlan2("January 2026", "DAC Theory-1");
		
		
		System.out.println("Course plan view successful");
		
		
	}
	
	
}

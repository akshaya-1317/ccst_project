package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Baseclass;

public class ViewCoursePlan extends Baseclass {
	WebDriver driver;
	Baseclass base;
	
	//XPATH IN VIEW COURSE PLAN
	//By manageCC = By.xpath("//a[@class='drop'and @href='#']");
	By viewcourseplan = By.xpath("//a[@href='/feedbackSystem/login/manager/viewCenterHeadCoursePlan']");
	
	
	By courseType = By.id("courseTypeId");
	By course = By.id("courseId");
	By batch = By.id("batch");
	By subbatch = By.id("batchId");
	
	//CONSTRUCTOR
	public ViewCoursePlan(WebDriver driver,Baseclass baseInstance) {
        this.driver = driver;
        this.base = baseInstance;
    }
	
	//NAVIGATE TO VIEW COURSE PLAN
	public void navigateToViewCoursePlan() {
      //  driver.findElement(manageCC).click();
        driver.findElement(viewcourseplan).click();
    }
	
	//INSTANCE METHOD
	public void selectCoursePlan(String coursetype, String courseName) {
		base.selectFromDropdown(courseType, coursetype);
        base.selectFromDropdown(course, courseName);
        
	}
	
	//INSTANCE METHOD
	public void selectCoursePlan2(String batchName, String subbatchName) {    
        base.selectFromDropdown(batch, batchName);
        base.selectFromDropdown(subbatch, subbatchName);

	}
}

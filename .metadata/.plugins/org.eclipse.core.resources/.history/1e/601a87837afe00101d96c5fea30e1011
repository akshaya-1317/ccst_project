package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.Baseclass;

public class AssignCc extends Baseclass {
	WebDriver driver;
	Baseclass base;
	
	By manageCC = By.xpath("//a[@class='drop'and @href='#']");
	By assigncc = By.xpath("//a[@href='/feedbackSystem/login/faculty/call_assign_ccPage']");
	
	By courseTypeDropdown = By.id("courseTypeId");
	By batchDropdown = By.id("batchAsCourseType");
	By coordinatorDropdown = By.id("CC_id");
	By assignButton = By.xpath("//input[@value='Assign']");
	

	
	By checkbox = By.xpath("//*[text()=\"CCST Project Test Course 2\"]");
	
	
	public AssignCc(WebDriver driver, Baseclass baseInstance ) {
        this.driver = driver;
        this.base = baseInstance;
    }
	
	public void navigateToAssignCoordinator() {
        driver.findElement(manageCC).click();
        driver.findElement(assigncc).click();
    }
	
	 public void submitAssignment() {
     	driver.findElement(assignButton).click();
         base.acceptAlert();
     }
	
	public void fillAssignmentForm(String courseType, String batch, String coordinator, String courseName) {
       
        base.selectFromDropdown(courseTypeDropdown, courseType);
        base.selectFromDropdown(batchDropdown, batch);
        base.selectFromDropdown(coordinatorDropdown, coordinator);
	
	
        driver.findElement(checkbox).click();
        
       
        
	
	
//	public void selectMultipleCourses(String[] courseNames) {
//	    for (String name : courseNames) {
//	        selectCourseByName(name);
//	    }
	
}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCourseCoordinator {
	WebDriver driver;
	
	//LOCATORS TO VIEW COURSE COORDINATOR
	By manageCC = By.xpath("//a[@class='drop'and @href='#']");
	By viewCC = By.xpath("//a[@href='/feedbackSystem/login/faculty/viewCC']");
	
	//CONSTRUCTOR
	 public ViewCourseCoordinator(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 //INSTANCE METHOD
	 public void viewCCoordinator() {
		 driver.findElement(manageCC).click();
		 driver.findElement(viewCC).click();
	 }
	
	
	
}

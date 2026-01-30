package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCourseCoordinator {
	WebDriver driver;
	
	By manageCC = By.xpath("//a[@class='drop'and @href='#']");
	By viewCC = By.xpath("//a[@href='/feedbackSystem/login/faculty/viewCC']");
	
	 public ViewCourseCoordinator(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public void viewCCoordinator() {
		 driver.findElement(manageCC).click();
		 driver.findElement(viewCC).click();
	 }
	
	
	
}

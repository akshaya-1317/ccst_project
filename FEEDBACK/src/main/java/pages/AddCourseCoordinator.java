package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCourseCoordinator {
	WebDriver driver;
	
	
	  // By manageCC = By.xpath("//b[contains(text(), 'Manage Course Coordinator')]");
	  By manageCC = By.xpath("//a[@class='drop'and @href='#']");
	  By addCC = By.xpath("//a[@href='/feedbackSystem/login/faculty/addCourseCoordinator']");

	  
	  By ccname = By.id("ccName");
	  By ccemail = By.id("emailId");
	  By ccphone = By.id("phoneNo");
	  By ccmobile = By.id("mobileNo");
	  By addButton = By.xpath("//input[@value='Add']");
	  
	  public AddCourseCoordinator(WebDriver driver) {
	        this.driver = driver;
	    }
	  
	  public void navigateToAddCoordinator() {
		  driver.findElement(manageCC).click();
		  driver.findElement(addCC).click();
	  }
	  
	  
	  public void fillCoordinatorDetails(String name, String mail, String phone, String mobile) {
	        driver.findElement(ccname).sendKeys(name);
	        driver.findElement(ccemail).sendKeys(mail);
	        driver.findElement(ccphone).sendKeys(phone);
	        driver.findElement(ccmobile).sendKeys(mobile);
	        driver.findElement(addButton).click();
	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  public WebElement manageCourseC() {
//	    	
//	    	return driver.findElement(manageCC);
//		}
//	  
//	  public WebElement addCourseC() {
//	    	
//	    	return driver.findElement(addCC);
//		}
//	  
//	  public WebElement addCcName() {
//	    	
//	    	return driver.findElement(ccname);
//		}
//	  
//	  public WebElement addCcEmail() {
//	    	
//	    	return driver.findElement(ccemail);
//		}
//	  
//	  public WebElement addCcPhone() {
//	    	
//	    	return driver.findElement(ccphone);
//		}
//	  
//	  public WebElement addCcMobile() {
//	    	
//	    	return driver.findElement(ccmobile);
//		}
	  
	  
//	  public void addcoursec() {
//		  driver.findElement(manageCC).click();
//		  driver.findElement(addCC).click();
//	  }
//	  
	  
	  
}

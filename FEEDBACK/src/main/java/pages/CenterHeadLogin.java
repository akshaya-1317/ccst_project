package pages;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CenterHeadLogin {
	
	WebDriver driver;
	
	//XPATH FOR LOGIN 
	By username=By.xpath("//input[@name='loginId']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@id='signIn']");
	
	
	//CONSTRUCTOR
	public CenterHeadLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	//STRING THROUGH TESTDATA CSV FILE
	public void chlogin(String user, String pass) {
		String u = (user == null) ? "" : user;
	    String p = (pass == null) ? "" : pass;
	    
	    
		
		
		//PASSING USERNAME AND PASSWORDS
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		
		
		driver.findElement(login).click();
		
		
	}
	
	


}

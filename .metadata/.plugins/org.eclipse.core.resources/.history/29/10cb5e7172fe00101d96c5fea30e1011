package base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

		public WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() {
			
		
	 //   driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		driver = new FirefoxDriver();
		driver.get("https://test-ofs.pune.cdac.in/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		public void selectFromDropdown(By locator, String visibleText) {
	        Select dropdown = new Select(driver.findElement(locator));
	        dropdown.selectByVisibleText(visibleText);
		}
		
		public void acceptAlert() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
		}
		

//		@AfterMethod
//		public void closeBrowser() {
//			if(driver != null) {
//				driver.quit();
//			}
//		}

		

		
	}


		



package tests;

//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import base.Baseclass;
import pages.CenterHeadLogin;
import util.csvreader;


public class LoginTestCases extends Baseclass {
	
	//DATA PROVIDER 
	@DataProvider(name = "loginData")
    public Object[][] getData() {

		//FILEPATH OF CSV FILE
		String filePath = System.getProperty("user.dir") + "/src/main/resources/testdata/LoginData.csv";
        return csvreader.getTestData(filePath);
    }

			//TEST : VERIFY LOGIN
			//MADE BY : AKSHAYA KULKARNI
	
    @Test(priority=1, dataProvider = "loginData")
    public void verifyLogin(String username, String password) {
    	//LOGIN
        CenterHeadLogin chl = new CenterHeadLogin(driver);
        
        // USE PARAMETERS FROM CSV
        chl.chlogin(username, password);
        System.out.println("Login attempt finished for user: " + username);
    }
	
//	@Test(priority=1)
//	public void verifyValidLogin() {
//		CenterHeadLogin chl = new CenterHeadLogin(driver);
//		chl.chlogin("401", "OFSCHead#12345");
//		
//		SoftAssert sa = new SoftAssert();
//		
//		String ExpectedText = "https://test-ofs.pune.cdac.in/feedbackSystem/login/logmein";
//		String ExpectedText1 = "https://test-ofs.pune.cdac.in/feedbackSystem/login/";
//
//		String ActualText = driver.getCurrentUrl();
//		
//		sa.assertEquals(ActualText, ExpectedText);
//		sa.assertEquals(ActualText, ExpectedText1);
//
//		
//		sa.assertAll();
//		
//		//Assert.assertEquals("Center Head Profile", "Center Head Profile", "Not the Center head's dashboard");
//		
//		
//		
//		
//		System.out.println("Center head logged in successfully.");
//	}
//	
	
//	@Test(priority=0)
//	public void verifyInvalidLogin() {
//		CenterHeadLogin chl = new CenterHeadLogin(driver);
//		chl.chlogin("404", "OFSCHead");
//
//	}
	
}





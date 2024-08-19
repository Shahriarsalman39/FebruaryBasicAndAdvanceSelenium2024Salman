package locatorsAdv;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class DirectLocators extends BaseTestWithIfandElse {

	

	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}

	@Test
	public void loginTest() {
		
		driver.findElement(By.id("email")).sendKeys("salman");
	
	}
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void closeFacebook() {
		closeApplication();
		
	}
}

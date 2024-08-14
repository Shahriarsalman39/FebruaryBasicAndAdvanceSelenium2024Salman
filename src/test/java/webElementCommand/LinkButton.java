package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class LinkButton extends BaseTest{
	
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
		
	
	@Test
	
 void linkButtonText () {
		
		/*
		 * start with == <a 
		 * href== is optiontal 
		 * Text == > Forgot password? < 
		 * Text will be inside > < = is the Forgot password? End with </a>
		 * 
		 */
		
		WebElement forgot=driver.findElement(By.linkText("Forgotten password?"));
		forgot.click();
		
		
	}
	@Test
	public void linktext2() {
		
		WebElement forgor2 = driver.findElement(By.linkText("Forgotten password?"));
		forgor2.click();
	}
		
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
		
	}
}

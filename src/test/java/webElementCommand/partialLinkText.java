package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class partialLinkText extends BaseTest{
	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
	}
	@Test
	public void getPartialLink () {
		
		/*
		 * partialLinkText==compound text in the > < then we only use partial of that value
	                whit is compound values:
					•	value too long
					•	space in between the words
					•	special character in the values
					•	numeric character in the values
		
		 */
			//Contact Uploading & Non-Users
		
		
		WebElement contactLink=driver.findElement(By.partialLinkText("Contact uploading "));
		contactLink.click();
	}
	
	@Test
	public void partialLinkText2() {
		
		WebElement partiallink2 = driver.findElement(By.partialLinkText("Contact uploading"));
		partiallink2.click();
		//WebElement create = driver.findElement(By.partialLinkText("Create new"));
		//create.click();
	}
	
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
		
	}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class DirectLocators extends BaseTest{

	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
		
	}
	
	@Test (priority=1)
	public void whatIsdirectLocator() {
		
		/*When you can directly spot a tag and attributes 
		 * those called direct locators
		 *    id,name, class, linkText, partialLinkText
		 *    id is the best one
		 */	
		
	}
	@Test(priority=2)
	public void idTest() {
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("inln");
		}
	
	@Test(priority=3)
	public void nameTest( ){
		WebElement password =driver.findElement(By.name("pass"));
		password.sendKeys("fafa");
		}
	
	@Test(priority=4)
	public void classTest() {
		WebElement forgotpass=driver.findElement(By.className("_6ltj"));
		forgotpass.click();
	}
		
	@Test(priority=5)
	public void linkTest() {
		WebElement spanishLin=driver.findElement(By.linkText("Español"));
		spanishLin.click();
	}
		@Test(priority=6)
		
		public void partialTest(){
			
			WebElement privacy= driver.findElement(By.partialLinkText("Privacy Centre"));
			privacy.click();
		}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
}

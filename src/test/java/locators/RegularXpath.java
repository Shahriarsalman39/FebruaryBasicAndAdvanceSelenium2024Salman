package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegularXpath extends BaseTest{

	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test (priority=0)
	public void regularXpathTestForID() {
		
		//driver.findElement(By.xpath("//input[@id='email']"));
		WebElement userName= driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("hahah");
	}
@Test(priority=1)
	
	public void regularXpathTestForClass() {
		WebElement password= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("dfdsf");
	}
	
	@Test (priority=2)
	public void regularXpathTestForName() {
		WebElement password= driver.findElement(By.xpath("//button[@name='login']"));
		password.sendKeys("hgghjg");
	}
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
	
		
}

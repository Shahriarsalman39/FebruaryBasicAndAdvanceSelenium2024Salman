package locatorForPractice;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class XpathLoopAndDynamicXpathForFacebook extends BaseTestWithIfAndElse{

	@BeforeMethod
	public void openFB() {
		opneApplication();
		
}
	@Test
	public void xpathLoop() {
		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[6]")).click();
		
	}

	@Test
	public void xpathLoop2() {
		driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li[9]")).click();
		
	}
	
	
	@Test
	public void containDynamic() {
		driver.findElement(By.xpath("//input[contains(@class,'inputtext ')][1]")).sendKeys("Salman");
		driver.findElement(By.xpath("//input[contains(@class,' _55r1 _6luy _9npi')]")).sendKeys("Salman");
		
	}
	
	
	@AfterMethod
	public void closeFB() {
		closeApplication();
	}
	
}

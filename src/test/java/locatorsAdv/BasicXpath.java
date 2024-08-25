package locatorsAdv;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class BasicXpath extends BaseTestWithIfAndElse {

	@BeforeTest
	public void openFacebook() {
		opneApplication();
	}

	@Test
	public void xpathFormula() {
		// tag[@Attribute='value']
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("salman");
		// input[@name='email']
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("salman");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test
	public void linkXpath() {
		driver.findElement(By.xpath("//a[@title='Spanish']")).click();
		
	}

	@AfterTest
	public void closeApplication() {
		if (driver != null)
			driver.quit();
	}

}

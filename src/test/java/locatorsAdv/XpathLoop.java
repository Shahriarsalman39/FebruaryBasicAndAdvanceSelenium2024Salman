package locatorsAdv;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class XpathLoop extends BaseTestWithIfAndElse {

	@BeforeTest
	public void openFacebook() {
		opneApplication();
	}

	@Test
	public void XpathLoopTest() {

		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[4]")).click();
	
		
	}
	
	
	@Test
	public void XpathIndexTest() {
	driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[15]")).click();
		
	}
	
	
	//@AfterTest
	public void closeApplication() {
		if (driver != null)
			driver.quit();
	}
}

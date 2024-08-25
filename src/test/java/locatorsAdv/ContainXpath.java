package locatorsAdv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class ContainXpath extends BaseTestWithIfAndElse {

	@BeforeTest
	public void openFacebook() {
		opneApplication();
	}

	@Test
	public void containMethod() {
//text always stays in between<>
		driver.findElement(By.xpath("//a[contains(text(),'Español')]")).click();
		
	}
	
	@Test
	public void partialContainTextMethos(){
		WebElement pctm= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]"));
		System.out.println(pctm);
	}

	@AfterTest
	public void closeApplication() {
		if (driver != null)
			driver.quit();
	}
}

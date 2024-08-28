package locatorForPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DirectLocatorForAmazon extends BaseTestForAmazon {

	@BeforeMethod
	public void openAm() {
		openApplication();

	}

	@Test
	public void Test() {
		driver.findElement(By.id("ap_email")).sendKeys("salman");
		
		driver.findElement(By.className("a-button-input")).click();
		
		WebElement wp = driver.findElement(By.linkText("Conditions of Use"));
		System.out.println(wp + "text is");
        
		WebElement wp1 = driver.findElement(By.partialLinkText("Shop on Amazon"));
		System.out.println(wp1 + "text is");
		
		
	}

	@AfterMethod
	public void closeAm() {
		closeApplication();
	}
}

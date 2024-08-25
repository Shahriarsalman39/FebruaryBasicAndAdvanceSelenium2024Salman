package locatorsAdv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class DirectLocators extends BaseTestWithIfandElse {

	@BeforeTest
	public void openFacebook() {
		openApplication();
	}

	@Test
	public void loginTest() {

		driver.findElement(By.id("email")).sendKeys("salman");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void linkAnadPartialLink() {
		/*
		 * Link Text starts with <a herf <Español> If link is too long if link is
		 * compound if link is dynamic
		 */

		driver.findElement(By.linkText("Español")).click();
		;

	}

	@Test
	public void PartialLinkTest() {
		/*
		 * 1. Link Text starts with <a herf <Español>
		 * 
		 * 2. If link is too long 3. if link is compound space in between special
		 * character number in between under score in between 4. if link is dynamic
		 */
		driver.findElement(By.partialLinkText("Contact ")).click();

	}

	@Test
	public void classAttributeTest() {

		WebElement text = driver.findElement(By.className("_8eso"));
		System.out.println("what is text : " + text.getText());
	}

	@AfterTest
	public void closeFacebook() {
		closeApplication();

	}
}

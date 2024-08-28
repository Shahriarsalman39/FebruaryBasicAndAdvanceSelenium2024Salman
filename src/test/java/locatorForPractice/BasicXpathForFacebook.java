package locatorForPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class BasicXpathForFacebook extends BaseTestWithIfAndElse{

	@BeforeMethod
	public void openFB() {
		opneApplication();
		
}
	@Test
	public void basicXpath() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Salman");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ahgvHo");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
		
		
	}
	@Test
	public void basicXpath1() {
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();	
		
	}
	
	@Test
	public void basicXpath2() {
		driver.findElement(By.xpath("//a[text()='Español']")).click();	
		
	}
	
	@Test
	public void basicXpath3() {
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();	
		
	}
	
	@Test
	public void basicXpath4() {
		driver.findElement(By.xpath("//a[contains(text(),'Voting Information')]")).click();	
		
		
	}
	
	@Test
	public void basicXpath5() {
		WebElement textxpath=driver.findElement(By.xpath("//h2[contains(text(),' share with the people in your life.')]"));	
		System.out.println(textxpath+ "Text is : ");
		
	}
	
	@AfterMethod
	public void closeFB() {
		closeApplication();
	}
	
}

package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestWithIfAndElse;

public class DynamicLoginTest extends BaseTestWithIfAndElse{
	
	@BeforeMethod
	public void openfb() {
		opneApplication();
		
		
	}
	@Test
	public void ValidloginTest() {
		loginTest("378faf@gmail.com", "5852hjamfhn");
		
	}
	
	@Test
	public void invalidPassTest() {
		loginTest("378faf@gmail.com", "5852hjamfhn");
		
	}
	
	
	@Test
	public void invalidusernameTest() {
		loginTest("378faf@gmail.com", "5852hjamfhn");
		
	}
	@Test
	public void InvalidloginTest() {
		loginTest("378faf@gmail.com", "juehk5");
		
	}
	@Test
	public void validUsernameInvalidPasswordnTest() {
		loginTest("378faf@gmail.com", "juehk5");
		
	}
	
	
//Helper Method
	public void loginTest(String Username, String Password) {
		
		driver.findElement(By.id("email")).sendKeys("Username");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	@AfterMethod
	public void closefb() {
		
		closeApplication();
	}
	
	
}

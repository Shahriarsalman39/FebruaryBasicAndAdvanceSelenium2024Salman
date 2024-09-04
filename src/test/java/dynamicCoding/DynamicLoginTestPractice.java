package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;


public class DynamicLoginTestPractice extends BaseTestWithIfandElse{

	
	


	@BeforeMethod
	public void openfb() {
		openApplication();
	}
	
	
	//Helper Method
	public void loginTest(String Usename, String Password ) {
		
		driver.findElement(By.id("email")).sendKeys("Usename");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	public void validUsernameTest() {
		loginTest("salman@gmail.com","154hyek");
		
	}
	
	@Test
	public void validPasswordTest() {
		loginTest("salfae4gfman@gmail.com","1452jmfnah@!");
		
	}
	
	@Test
	public void InvalidUsernameTest() {
		loginTest("fasdfwerf145@gmail.com","jhfs4588ese");
		
	}
	
	@Test
	public void InvalidPasswordTest() {
		loginTest("fasrf","janhe5");
		
		
	}
	
	@Test
	public void InvalidPasswordTest13() {
		loginTest("fasrf","janhe5");
		
		
		
	}
	
	
	@AfterMethod
	public void Closefb() {
		closeApplication();
	}
	
	
	
	
	
	
	
}

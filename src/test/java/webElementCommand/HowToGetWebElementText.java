package webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class HowToGetWebElementText extends BaseTest{
	
	@BeforeMethod
	public void openFaceBook() {
		openApplication();
	}
	
	@Test
	void getText(){
		
	WebElement	loginButton=driver.findElement(By.name("login"));
	String loginButtonText=loginButton.getText();
	System.out.println("log in button text is---> "+loginButtonText);
	String actualLoginButtonText="Log in";
	Assert.assertEquals(loginButtonText, actualLoginButtonText," <<text did not match>>  ");
	loginButton.click();
	
	}
	
	@Test
	public void loginTest2() {
	WebElement	loginButton1 =driver.findElement(By.name("login"));
	String loginbuttonTeszt2 = loginButton1.getText();
		System.out.println("login in button is-->"+loginbuttonTeszt2);
		String actualLoginbutton = "Log in";
	Assert.assertEquals(loginbuttonTeszt2, actualLoginbutton);
	loginButton1.click();
	}
	
	
	
	
	@AfterMethod
	public void closeFaceBook() {
		closeApplication();
	}

}
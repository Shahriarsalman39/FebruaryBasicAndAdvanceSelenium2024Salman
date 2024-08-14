package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class ContainTextFunction extends BaseTest {
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	
	
	
	@Test (invocationCount=2)
	public void regularTextFunction() {
		/*//h2[text()='Connect with friends and the world around you on Facebook.']
		 *  
		 *  //tag[text()='vlaue']
		 */
		
		
		
	WebElement connectFriend=	driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String connectFriendText =connectFriend.getText();
	System.out.println(connectFriendText);
		
	}

	
	@Test
	public void containTextfunction() {
		
		WebElement connetFriends= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')] "));
	String connetFriendsString =connetFriends.getText();
	System.out.println("Contain Functions"+ " " +connetFriendsString);
	
	}
	
	
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
	}
	
	
}

	


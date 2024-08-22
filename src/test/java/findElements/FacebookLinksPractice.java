package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class FacebookLinksPractice extends BaseTestWithIfandElse{

	@BeforeTest
	public void openfb() {
	 openApplication();
	}
	
	//@Test
	public void linkPractice() {
		
		List<WebElement> Links =  driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		System.out.println("How many links there : " + Links.size() );
		Assert.assertEquals(Links.size(),32,  "link does not match :");
	
		for (int i = 0; i < Links.size(); i++) {
			System.out.println(Links.get(i).getText());
		}
	
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void test1() {
		
	List<WebElement> Links58 = driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
	System.out.println(Links58.size());
	Assert.assertEquals(Links58.size(), 32, "Total link is :");
	
	for (int i = 0; i < Links58.size(); i++) {
		System.out.println(Links58.get(i).getText().toString());
	}
	}
	
	
	//@Test
	public void specialLinktest58() {
	 List<WebElement>	linkTest= driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
	 for (int i = 0; i < linkTest.size(); i++) {
		 String linkName =linkTest.get(i).getText();
		System.out.println(linkName);
	}
	}
	//@Test
	public void speciallinktest78() {
		
	List<WebElement>  linkTest2=	driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
	for (int i = 0; i < linkTest2.size(); i++) {
		String LinkName=linkTest2.get(i).getText();
		System.out.println(LinkName);
		
		if (LinkName.equalsIgnoreCase("Español")) {
			linkTest2.get(i).click();
		
		}
	}
						
	}

	@Test
	public void linkTest589() {
	List<WebElement>	specialLInkTest =driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
		for (int i = 0; i < specialLInkTest.size(); i++) {
		String	LinkName= specialLInkTest.get(i).getText();
			System.out.println(LinkName);
			
			if (LinkName.equalsIgnoreCase("Español")) {
				specialLInkTest.get(i).click();
				
			}
			
		}
	
	
	
	
	
	
	
		
	}

	@AfterTest
	public void closeFb() {
		closeApplication();
		
	}
}

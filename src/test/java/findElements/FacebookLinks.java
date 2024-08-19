package findElements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class FacebookLinks extends BaseTestWithIfandElse {

	@BeforeTest
	public void openFacebbok() {
		openApplication();
	}
	
	@Test
	public void linkTest() {
	
	List<WebElement>links= driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
	System.out.println("how many links : "+links.size());
	Assert.assertEquals(links.size(), 32,"Size Does match");
	
for (int i = 0; i <= links.size(); i++) {
	System.out.println(links.get(i).getText());
		
}
	}
@Test
	public void specificLinkTest() {
		List<WebElement> languageLink= driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
		for (int i = 0; i <languageLink.size(); i++) {
			String languagename =languageLink.get(i).getText();
			System.out.println(languagename);
			if(languagename.equalsIgnoreCase("Español")) {
				languageLink.get(i).click();
			}
			break;
		}
		
		
	}
	
	
	
	
	@AfterTest
	public void closeFacebook() {
		closeApplication();
		
	}
}

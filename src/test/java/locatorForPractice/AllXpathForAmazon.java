package locatorForPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllXpathForAmazon extends BaseTestForAmazon{

	@BeforeMethod
	public void openAm() {
		openApplication();
		
}
	@Test
public void Xpath() {
		
		driver.findElement(By.xpath("//*[@class='product-image']")).click();
		
		
	}
	
	@Test
	public void Xpath1() {
			
			
			driver.findElement(By.xpath("//*[@class='a-link-normal']")).click();
			
		}
	
	@Test
	public void Xpath2() {
			
			
			driver.findElement(By.xpath("//*[@class='a-section feed-carousel-viewport']/ul/li[5]")).click();
			
		}
	
	
	@Test
	public void Xpath3() {
			
			
			driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
			
		}
	
	@Test
	public void Xpath4() {
			
			
			driver.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li[6]")).click();
			
		}
	
	@Test
	public void Xpath5() {
			
			
			driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
			
		}
	

	@Test
	public void Xpath6() {
			
			
		WebElement	 sp6 = driver.findElement(By.xpath("//div[contains(text(),'Make Money ')]"));
			System.out.println(sp6);
		}
	
	
	
	//@AfterMethod
	public void closeAm() {
		closeApplication();
	}
	
	
}

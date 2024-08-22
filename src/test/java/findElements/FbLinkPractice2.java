package findElements;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse;

public class FbLinkPractice2 extends BaseTestWithIfandElse {

	@BeforeMethod
	public void fbOpen() {
		
		openApplication();
	}
	
	@Test
	public void linkTest() {
		List<WebElement> linkTest5=driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		System.out.println(linkTest5.size());
		assertEquals(linkTest5.size(), 32 , "link count is :");
		
		for (int i = 0; i <linkTest5.size() ; i++) {
			System.out.println(linkTest5.get(i).getText());
		}
	}
	@Test
	public void linkTest66() {
		List<WebElement> link3= driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		System.out.println(link3.size());
		for (int i = 0; i < link3.size(); i++) {
			
		
			System.out.println(link3.get(i).getText());
		}
	}
	@Test
	public void SpecialLinkTest() {
		
		 List<WebElement> spT= driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
		 for (int i = 0; i < spT.size(); i++) {
			//System.out.println(spT.get(i).getText());
			 String sptname=spT.get(i).getText();
			 System.out.println(sptname);
			 
			 if (sptname.equalsIgnoreCase("Español")) {
				 spT.get(i).click();
				
			}
		}
	}
	
	
	@Test
	public void linktest69() {
	List<WebElement>	link58=  driver.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
		System.out.println(link58.size());
		Assert.assertEquals(link58.size(), 32, "link count is : ");
		for (int i = 0; i < link58.size(); i++) {
			System.out.println(link58.get(i).getText());
		}
	}
	@Test
	public void spc39() {
		List<WebElement> sp=  driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li"));
		for (int i = 0; i < sp.size(); i++) {
			String sp2=  sp.get(i).getText();
			System.out.println(sp2);
			if(sp2.equalsIgnoreCase("Español")) {
			sp.get(i).click();
			}
		}
	}
	
	
	@AfterMethod
	public void fbClose() {
		closeApplication();
		
	}
}

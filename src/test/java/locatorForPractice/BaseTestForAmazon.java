package locatorForPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTestForAmazon {

	
	public WebDriver driver;
	String Browser="Chrome";
	
	
	public WebDriver openApplication() {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver =new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("Firefox")) {
			driver =new FirefoxDriver();
		}
		else if (Browser.equalsIgnoreCase("Edge")) {
			driver =new EdgeDriver();
		}
		else {
			System.out.println("we do not support this Browser : ");
		}
		
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.amazon.com/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex&openid.pape.max_auth_age=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
	
	
	
	public void closeApplication() {
		
		if(driver != null) {
			driver.quit();
			
		}
	}
}



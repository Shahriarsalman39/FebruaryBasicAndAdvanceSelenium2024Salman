package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
public WebDriver driver;
	String Browser= "chrome";
	
	public WebDriver openApplication() {

		if (Browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
		}else {
		System.out.println("Sorry we do not cover that browser"); 
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		return driver;

		}
	
			
	public void closeApplication() {
		driver.quit();
		}
}

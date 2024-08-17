package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfAndElsePractice {

	public WebDriver driver;
	
	String Browser= "chrome";
	

public WebDriver  ifAndElse() {
	
	if(Browser.equalsIgnoreCase("Chrome")) {
		 driver = new ChromeDriver();
	}
	else if (Browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	else if (Browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("we do not support this Browser");
	}
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
    
}





























}
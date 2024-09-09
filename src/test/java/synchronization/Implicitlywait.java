package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicitlywait {

	WebDriver driver;
	
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.get()== is fully loaded with pageLoadTimeout(Duration.ofSeconds(10));
		//so u do not have to write
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		//Implicit wait for loading page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//if u use driver.navigate().to();
		//make sure to write navigate method
		// because navigate method doesnot wait for page to load
		
		
		//Implicit wait for findelement method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email"));
		
		
		
		//Implicit wait for Scripting
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
	}
}

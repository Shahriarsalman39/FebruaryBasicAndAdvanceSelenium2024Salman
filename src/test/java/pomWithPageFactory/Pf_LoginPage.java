package pomWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pf_LoginPage {

	
	WebDriver driver;

	
	public Pf_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy (id="email") public WebElement uName;
	@FindBy (name="pass") public WebElement pass;
	@FindBy (xpath="//button[starts-with (@id,'u_0_5')]") public WebElement lButton;
	
	
	public WebElement userName(String einterUserName) {
		uName.sendKeys(einterUserName);
		return uName;
		
	}
	

	
	
	public WebElement password(String enterYourPassword) {
		pass.sendKeys(enterYourPassword);
		return pass;
	}
	
	
	
	public void LoginButton() {
		lButton.click();
	}
	
	
	
	public WebElement userName1 (String einterUserName) {
		WebElement uname= driver.findElement(By.id("email"));
		uname.sendKeys("einterUserName");
		return uname;
	}
	
	
}

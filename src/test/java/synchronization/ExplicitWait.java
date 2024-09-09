package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	WebDriver driver;
WebDriverWait wait;
	
	public ExplicitWait(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email") private WebElement uNmae;
	public WebElement userName(String eneterUserName) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(uNmae));
		uNmae.sendKeys(eneterUserName);
		return uNmae;
		
		
	}
	
	@FindBy (name="pass") private WebElement password;
	
	public WebElement password(String enterpass) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(password));
	password.sendKeys(enterpass);
	return password;
	}
	
	@FindBy (xpath="//button[starts-with (@id,'u_0_5')]") private WebElement lButton;
	
	public void loginButton() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(lButton)).click();
		
		
	}
}

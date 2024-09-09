package synchronization;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitTest extends BaseTest{

	
	ExplicitWait ex;
	
	@BeforeTest
	public void openapp() {
		
		
	}
	
	@Test
	public void logintest() {
		ex =new ExplicitWait(driver);
		ex.userName("salman")	;
		ex.password("ss");
		ex.loginButton();
	}
	
	@AfterTest
	public void closeapp() {
		
		
	}
}

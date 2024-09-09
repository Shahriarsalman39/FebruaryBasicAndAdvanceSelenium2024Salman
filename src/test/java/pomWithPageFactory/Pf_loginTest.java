package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pf_loginTest extends Pf_BaseTest{

	
	@BeforeMethod
	public void openFaceBook() {
		opneApplication();
	}
	Pf_LoginPage lp;
	
	@Test
	public void validLoginTest() {
		lp = new Pf_LoginPage(driver);
		lp.userName("salman12@gamil.com");
		lp.password("salman587");
		lp.LoginButton();
		
	}
	
	
	
	@AfterMethod
	public void closeFaceBook() {
		closeApplication();
	}
}

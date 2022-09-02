package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
@Listeners(TestListeners.class)

public class LoginPageTest extends BaseTest {
	
	
	@BeforeMethod
	public void browser() {
		driver =Browser.openBrowser();
	}
	
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
	ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
	String userName =Parametrization.getData("zerodha", 0, 1);
	String password = Parametrization.getData("Zerodha", 1, 1);
	
	zerodhaloginpage.enterUserID(userName);
	zerodhaloginpage.enterPassword(password);
	zerodhaloginpage.clickOnLogin();
	}
	@Test
	public void forgotpasswordlinktest() {
		ZerodhaLoginPage zerodhaloginpage =new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnForgotPassword();
	}
	@Test
	public void signupLinkTest() {
		ZerodhaLoginPage zerodhaloginpage =new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickOnSignUp();
	}	
	@Test
	public void Demo () {
	System.out.println("adding new test Demo");	
	}
		
		
		
		
		
		
		
		
		
	}



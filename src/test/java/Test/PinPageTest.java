package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTest {
   WebDriver driver;
   @BeforeMethod
   public void launchBrowser() {
	driver = Browser.openBrowser();
   }
   @Test
   public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		String userName =Parametrization.getData("zerodha", 0, 1);
		String password = Parametrization.getData("Zerodha", 1, 1);
		
		zerodhaloginpage.enterUserID(userName);
		zerodhaloginpage.enterPassword(password);
		zerodhaloginpage.clickOnLogin();
		Thread.sleep(5000);
		ZerodhaPinPage zerodhapinpage =new ZerodhaPinPage(driver);
		String pin = Parametrization.getData("Zerodha", 2, 1);
		System.out.println(pin);
		zerodhapinpage.enterPin(pin);
		zerodhapinpage.clickOnContinue();
   }	
		
		
		
		
		
		
		
		
		
	
			

}

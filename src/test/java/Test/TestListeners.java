package Test;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class TestListeners extends BaseTest implements ITestListener {
	public void onTestStart(ITestResult result) {
	System.out.println(result.getName()+"Test has started");
	}
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takeScreenShot(driver,result.getName());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test Success");
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test Skipped");
	}
}    

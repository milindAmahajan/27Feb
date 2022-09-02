package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser3 {
      
	
	public static WebDriver openBrowser (String url) {
		System.setProperty("webdriver.chrome.driver","E:\\milind file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting chrome driver class to webdriver
		driver.get(url);//method of webdriver interface
		driver.manage().window().maximize();
		return driver ;
}
}
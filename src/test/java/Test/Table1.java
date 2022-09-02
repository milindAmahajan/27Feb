package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser3;

public class Table1 {
	public static void main(String[] args) {
		WebDriver driver =Browser3.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column =driver.findElements(By.xpath("//table//thead//tr//th"));
		int columnsize =column.size();
		System.out.println(columnsize);
		
		List<WebElement> rows= driver.findElements(By.xpath("//table//tbody//tr"));
		int rowSize = rows.size();
		
		List<WebElement> currentprice= driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		
		for(int i =0;i<currentprice.size();i++)
		{
			WebElement price =currentprice.get(i);
			String currentPricevalue = price.getText();
			System.out.println(currentPricevalue);
		}
	}

}

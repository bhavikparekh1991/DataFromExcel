package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/PBHAVIK/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-table/");
	
	List<WebElement> list_options = driver.findElements(By.xpath(".//*[@id='content']/table/tbody/tr/td[4]"));
	List<Integer> listInt_optins = new ArrayList<Integer>();
	List<Integer>   index = new ArrayList<Integer>();
	for(WebElement year: list_options)
	{
		listInt_optins.add(Integer.parseInt(year.getText()));
	}
	for(int yearint: listInt_optins)
	{
		if(yearint>2004)
		{
			index.add(listInt_optins.indexOf(yearint));
		}
	}
	for(int i :index)
	{
		int ind = i+1;
		System.out.print(driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ind+"]/td[1]")).getText());
		System.out.println("_"+driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ind+"]/td[2]")).getText());
		
	}
	
	driver.quit();
	
	}
}

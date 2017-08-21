package excelExportAndFileIO;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=ctrl&amp;ei=bXAwU8jYN4W6iAf8zIDgDA&amp;gws_rd=cr");
		 
		 String cssValue= driver.findElement(By.xpath("//a[contains(@href,'hi&')]")).getCssValue("text-decoration");
		 
		 System.out.println("value"+cssValue);
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'hi&')]"))).perform();
		 
		 String cssValue1= driver.findElement(By.xpath("//a[contains(@href,'hi&')]")).getCssValue("text-decoration");
		 
		 System.out.println("value over"+cssValue1);
		 
		 driver.close();
		 driver.quit();*/
		 
		System.setProperty("webdriver.chrome.driver", "C:/Users/PBHAVIK/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://buyersadvantagesite.staging.cxloyaltyservices.com/buyer/login.jsp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElement(By.id("userID")).sendKeys("BASTG2");
		driver.findElement(By.xpath("//*[@class='password']")).sendKeys("Richmond1");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myproducts']/a")).click();;
		Thread.sleep(2000);
		List<WebElement> test = driver.findElements(By.xpath(".//*[@class='paginationLinks']/a"));
		System.out.println(test.size());
		while(test.get(test.size()-1).getText().trim().equals("next"))
		{
			test.get(test.size()-1).click();
			test = driver.findElements(By.xpath(".//*[@class='paginationLinks']/a"));
		}
		
	}
}


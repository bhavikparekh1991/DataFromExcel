package excelExportAndFileIO;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {

		/*HtmlUnitDriver driver = new HtmlUnitDriver(true);

		driver.setJavascriptEnabled(false);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");

		System.out.println(driver.getTitle());
		*/
		screeenshot();
		/*driver.close();
		driver.quit();*/
		}
	public static void screeenshot() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		Thread.sleep(1000);
		WebElement Search = driver.findElement(By.id("lst-ib"));
		Search.sendKeys("Sanjay_Line1.\n Sanjay_Line2.");
		//Search.sendKeys(Keys.ENTER);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("lst-ib"))).sendKeys(Keys.ENTER).perform();
		act.moveToElement(driver.findElement(By.id("lst-ib"))).contextClick();
		//act.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //now we can do anything with this screenshot
		try {
			FileUtils.copyFile(srcFile,new File("C://Users/pbhavik/Downloads/screenshot1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
}

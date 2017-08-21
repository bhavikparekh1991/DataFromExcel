package excelExportAndFileIO;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNG_DataProvider {
	private static WebDriver driver;
	 
	  @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "bhavik", "Qwer123$" ,"Hello","World"}, { "testuser_1", "Test@123","Hello1","World1" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	  @Test(dataProvider = "Authentication",groups="A")
	 
	  public void test(String sUsername, String sPassword, String Test1, String Test2) {
		  System.setProperty("webdriver.chrome.driver", "C://Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
		driver =  new ChromeDriver(); 
		 
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      System.out.println(Test1);
	      System.out.println(Test2);
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	      driver.quit();
	 
	  }
	  
	 /* @Test(dataProvider = "Authentication",groups="B")
		 
	  public void testa(String sUsername, String sPassword) {
		  System.setProperty("webdriver.chrome.driver", "C://Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
		driver =  new ChromeDriver(); 
		 
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	      driver.quit();
	 
	  }*/
	 
}

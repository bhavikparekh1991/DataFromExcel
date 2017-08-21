package excelExportAndFileIO;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.firefox.MarionetteDriver;

public class TestNG_DependsOn {
	//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	private static Logger Log = Logger.getLogger(Log.class.getName());
	public WebDriver driver;
	 
	  @Test (dependsOnMethods = {"beforeMethod"})
	  public void main() {
		  DOMConfigurator.configure("log4j.xml");
		// Find the element that's ID attribute is 'account'(My Account)
	 
	      driver.findElement(By.id("account")).click();
	      Log.info("MY Accoutn clicked");
	      // Find the element that's ID attribute is 'log' (Username)
	 
	      // Enter Username on the element found by above desc.
	 
	      driver.findElement(By.id("log")).sendKeys("bhavik");
	      Log.info("User Name Entered");
	 
	      // Find the element that's ID attribute is 'pwd' (Password)
	 
	      // Enter Password on the element found by the above desc.
	 
	      driver.findElement(By.id("pwd")).sendKeys("Qwer123$");//Test@123
	      Log.info("Password Entered");
	      // Now submit the form. WebDriver will find the form for us from the element
	 
	      driver.findElement(By.id("login")).click();
	      Log.info("login button clicked");
	      // Print a Log In message to the screen
	 
	      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	      Reporter.log("Sign In Successful | " );
	      // Find the element that's ID attribute is 'account_logout' (Log Out)
	 
	      driver.findElement(By.id("account_logout"));
	      Log.info("Logout button clicked");
	      Reporter.log("Logout Successful | " );
	  }
	 
	  @Test
	 
	  public void beforeMethod() {

		  //C:\Users\pbhavik\Downloads\geckodriver-v0.14.0-win64
		  // Create a new instance of the Firefox driver
		  System.setProperty("webdriver.gecko.driver", "C:/Users/pbhavik/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C://Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				  //firefox();
		  capabilities.setCapability("marionette", true);
		  driver = new ChromeDriver(); 
		  
		  //driver = new FirefoxDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	      driver.get("http://www.store.demoqa.com");
	      Reporter.log("Application Lauched successfully | ");
	  }
	 
	  @Test (dependsOnMethods = {"main"})
	 
	  public void afterMethod() {
	 
		  // Close the driver
	 
	      driver.quit();
	 
	  }

}

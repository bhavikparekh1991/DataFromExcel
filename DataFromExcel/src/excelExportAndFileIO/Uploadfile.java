package excelExportAndFileIO;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		 StringSelection sel = new StringSelection("C:\\Users\\pbhavik\\Downloads\\JMeter UserManual.docx");
		 // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 WebDriver driver;
		 String URL = "https://www.zamzar.com/";
		
			System.setProperty("webdriver.chrome.driver", "C:/Users/PBHAVIK/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			//driver.manage().window().maximize();
			WebElement element = driver.findElement(By.xpath("//*[@id='inputFile']"));
			element.click();
			// Create object of Robot class
			Robot robot = new Robot();
			Thread.sleep(1000);
			      
			// Press Enter
			robot.keyPress(KeyEvent.VK_ENTER);
			
			// Release Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
			 
			// Press CTRL+V
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+VC:\Users\pbhavik\Downloads\JMeter UserManual.docx
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			        
			//Press Enter 
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			System.out.println("upload");
			Thread.sleep(3000);
			driver.quit();
	               //Which calls the autoit exe file
			//Runtime.getRuntime().exec("C:\Users\pbhavik\Downloads\JMeter UserManual.docx");
		
	}

}

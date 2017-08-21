package excelExportAndFileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WriteGuru99ExcelFile {
	/*public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		// Create a new instance of the Firefox driver

       // driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "C:/Users/pbhavik/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //Now you can Initialize marionette driver to launch firefox
      DesiredCapabilities capabilities = DesiredCapabilities.firefox();
      capabilities.setCapability("marionette", true);
      WebDriver driver = new FirefoxDriver(); 
        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        
        String URL = "http://toolsqa.wpengine.com/iframe-practice-page/";
      //By executing a java script
        driver.get(URL);
        Thread.sleep(1000);
        driver.manage().window().maximize();
      		JavascriptExecutor exe = (JavascriptExecutor) driver;
      		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
      		System.out.println("Number of iframes on the page are " + numberOfFrames);
      		exe.executeScript("window.scrollBy(0,3000)", ""); //scroll down
      		 
      		 Thread.sleep(3000);
      		 
      		exe.executeScript("window.scrollBy(0,-3000)", "");
      		Thread.sleep(3000);
      		//By finding all the web elements using iframe tag
      		List<WebElement> iframeElements = driver.findElements(By.xpath("//iframe"));
      		System.out.println("The total number of iframes are " + iframeElements.size());
      		
      		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
      		 
      		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
      		 
      		FileUtils.copyFile(srcFile, new File("C://Users/pbhavik/Downloads/screenshot.png"));
      		driver.close();
      		 driver.get("http://www.creyate.com/en/homepage");
      		 
      		driver.quit();
        
        //-------------Drag & Drop-----------------
		  driver.get(URL);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id='g_signin']/button")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("Email")).sendKeys("bhavikparekh1991@gmail.com");
		  
		  driver.findElement(By.id("next")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("Passwd")).sendKeys("iamhappy1234+");
		  Thread.sleep(1000);
		  driver.findElement(By.id("PersistentCookie")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("signIn")).click();

		  driver.manage().window().maximize();

		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		  WebElement From = driver.findElement(By.xpath(".//*[@id='navigation']/ms-nav[1]/div[1]/ol/li[3]/ms-nav-item/div/div[1]/span[1]/md-icon"));
		
		
		  WebElement To = driver.findElement(By.xpath(".//*[@id='navigation']/ms-nav[1]/div[1]/ol/li[1]/ms-nav-item"));
		//*[@id="navigation"]/ms-nav[1]/div[1]/ol/li[1]/ms-nav-item
		  Actions builder = new Actions(driver);
		//*[@id="navigation"]/ms-nav[1]/div[1]/ol/li[1]/ms-nav-item/div
	      Action dragAndDrop = builder.clickAndHold(From)

		     .moveToElement(To)

		    .release(To)

		   .build();

		  dragAndDrop.perform();

        Set handles = driver.getWindowHandles();

        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}


        // Closing Pop Up window

       // driver.close();
        // Close Original window

       // driver.quit();

}
*/


	public void writeExcel() throws IOException{

		 File src=new File("C:/WorkSpace/Workspace/DataFromExcel/src/excelExportAndFileIO/ExportExcel.xlsx");
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheetAt(0);
		 
		      int rowCount = sh1.getLastRowNum();

    //Get the first row from the sheet

   //Row row = sh1.getRow(rowCount+1);
    Row newRow = sh1.createRow(rowCount+1);
    
    Cell column = newRow.createCell(0);
    Cell column1 = newRow.createCell(1);
    column.setCellValue("TEST");
    column1.setCellValue("TEST");
  
    //Create a new row and append it at last of sheet
   
     //Create a loop over the cell of newly created Row

    for(int j = 0; j < newRow.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);

        cell.setCellValue("Test");

    }

    //Close input stream

    fis.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(src);

    //write data in the excel file

    wb.write(outputStream);

    //close output stream

    outputStream.close();

    

    }

    

    public static void main(String[] args) throws IOException{

        //Create an array with the data in the same order in which you expect to be filled in excel file

       

        //Create an object of current class

        WriteGuru99ExcelFile objExcelFile = new WriteGuru99ExcelFile();

        //Write the file using file name , sheet name and the data to be filled

        objExcelFile.writeExcel();

    }

}

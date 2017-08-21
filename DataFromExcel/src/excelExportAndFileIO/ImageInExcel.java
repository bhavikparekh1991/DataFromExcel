package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ImageInExcel {
	public static void main(String[] args) throws IOException {
		  

			  
			  
			  /*FileInputStream ExcelFile = new FileInputStream(Path);
				ExcelWBook = new XSSFWorkbook(ExcelFile);*/
		   //Workbook wb = new XSSFWorkbook();
		   //Sheet sheet = wb.createSheet("My Sample Excel");
			  System.setProperty("webdriver.chrome.driver", "C:/Users/PBHAVIK/Downloads/chromedriver_win32/chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.google.co.in");
			  
			  
			   // now copy the  screenshot to desired location using copyFile //method
				  File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(screenshot, new File("C:/Users/PBHAVIK/Downloads/screenshotName.png"));
			 
			  
		      //String FullAddress=System.getProperty("user.dir")+"/"+ScreentShots+"/"+screenshotName+".png";
		File src=new File("C:/WorkSpace/Workspace/DataFromExcel/src/excelExportAndFileIO/ExportExcel.xlsx");
			 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheetAt(0);
		   //FileInputStream obtains input bytes from the image file
		   InputStream inputStream = new FileInputStream("C:/Users/PBHAVIK/Downloads/screenshotName.png");
		   //Get the contents of an InputStream as a byte[].
		   byte[] bytes = IOUtils.toByteArray(inputStream);
		   //Adds a picture to the workbook
		   int pictureIdx = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
		   //close the input stream
		   inputStream.close();
		   //Returns an object that handles instantiating concrete classes
		   CreationHelper helper = wb.getCreationHelper();
		   //Creates the top-level drawing patriarch.
		   Drawing drawing = sh1.createDrawingPatriarch();

		   //Create an anchor that is attached to the worksheet
		   ClientAnchor anchor = helper.createClientAnchor();

		   //create an anchor with upper left cell _and_ bottom right cell
		  /* anchor.setCol1(1); //Column B
		   anchor.setRow1(2); //Row 3
		   anchor.setCol2(2); //Column C
		   anchor.setRow2(3); //Row 4
*/		   
		   anchor.setCol1(2); //Column C
		   anchor.setCol2(3); //Column Da
		   anchor.setRow1(3); //Row 4
		   anchor.setRow2(4); //Row 5
		   		   

		   //Creates a picture
		   Picture pict = drawing.createPicture(anchor, pictureIdx);

		   //Reset the image to the original size
		   //pict.resize(); //don't do that. Let the anchor resize the image!

		   //Create the Cell B3
		   Cell cell = sh1.createRow(2).createCell(1);

		/*   //set width to n character widths = count characters * 256
		   int widthUnits = 20*256;
		   sh1.setColumnWidth(1, widthUnits);

		   //set height to n points in twips = n * 20
		   short heightUnits = 60*20;
		   cell.getRow().setHeight(heightUnits);
*/
		   //Write the Excel file
		   FileOutputStream fileOut = null;
		   fileOut = new FileOutputStream(src);
		   wb.write(fileOut);
		   fileOut.close();
	}
			    
}

package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;



public class ReadGuru99ExcelFile {
	@Test
	public static void main() {
		try {
			  // Specify the path of file
			  File src=new File("C:/WorkSpace/Workspace/DataFromExcel/src/excelExportAndFileIO/ExportExcel.xlsx");
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			      XSSFSheet sh1= wb.getSheetAt(0);
			 
			      int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();

			      //Create a loop over all the rows of excel file to read it

			      for (int i = 0; i < rowCount+1; i++) {

			          Row row = sh1.getRow(i);

			          //Create a loop to print cell values in a row

			          for (int j = 0; j < row.getLastCellNum(); j++) {

			              //Print excel data in console

			              System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			              //System.out.print(row.getCell(j).
			          }

			          System.out.println();
			        			         
			         /* FileOutputStream fout=new FileOutputStream(new File("location of file/filename.xlsx"));
			          wb.write(fout);
			          fout.close();*/
			          //sh1.getRow(0).createCell(2).setCellValue("2.41.0");
			      }
			     

			 } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
			 
			
	}

	
}
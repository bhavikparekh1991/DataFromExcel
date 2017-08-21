package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	//*[@id="HTMLFormElements"]/table/tbody/tr[7]/td/select
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		List<String> supplierNames = new ArrayList<String>();
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[7]/td/select")));
		List<WebElement> list_options = select.getOptions();
		
		for(WebElement temp2: list_options)
		{
			supplierNames.add(temp2.getText());
		}
		
		driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[3]/td/textarea")).clear();
		for(WebElement temp: list_options)
		{
			String lable = temp.getText().trim();
			
			driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[3]/td/textarea")).sendKeys(lable);
			driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[3]/td/textarea")).sendKeys("\n");
			
			select.selectByVisibleText(lable);
		}
		Thread.sleep(3000);
		select.deselectAll();
		
		//CheckBox_Select
		List<WebElement> Check_box = driver.findElements(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[5]/td/input"));
		for(int i=0;i<Check_box.size();i++)
		{
			if(!Check_box.get(i).isSelected())
			{
				Check_box.get(i).click();
			}
		}
		
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[8]/td/select")));
		select1.selectByVisibleText("Drop Down Item 5");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		 
	}
}

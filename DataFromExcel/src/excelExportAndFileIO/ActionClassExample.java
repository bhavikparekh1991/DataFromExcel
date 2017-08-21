package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class ActionClassExample {
	
	public static <T> void printList(List<T> numbers) {
		for (T n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void printSquare(List<? extends Number> numbers) {
	    for (Number n : numbers) {
	        double d = n.doubleValue();
	        System.out.println(d * d);
	    }
	}
	public static void main(String[] args) throws InterruptedException {
		//String baseUrl = "http://newtours.demoaut.com/";
      //  System.setProperty("webdriver.chrome.driver", "C:/Users/pbhavik/Downloads/chromedriver_win32/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
		//.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(baseUrl);           
       // link_Home = driver.findElement(By.linkText("Home"));
		// td_Home = driver.findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td"+ "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr"));            
		//WebElement UserName = driver.findElement(By.xpath("*//input[@name='userName']"));
                 
               // Actions builder = new Actions(driver);
               // Action mouseOverHome = builder
                //        .keyDown(UserName, Keys.SHIFT).sendKeys(UserName, "Test").keyUp(UserName, Keys.SHIFT).doubleClick(UserName).contextClick().build();                 
              //  mouseOverHome.perform();
              //  Thread.sleep(5000);
                
                List test = new ArrayList();
                test.add("hello");
                test.add("how");
                test.add("are");
                test.add("you");
                //test.add(1);
                System.out.println(test);
                
                Iterator iterator = test.iterator();
                ListIterator itr = test.listIterator();
                
                System.out.println(iterator);
                while(iterator.hasNext()){
                  String element = (String) iterator.next();
                  System.out.println(element);
                                  
                }
                
                while(itr.hasNext()){
                	/*String e = (String) itr.next();
                	System.out.println("List_Iterator : "+e);*/
                	System.out.println("List_Iterator 1 : "+itr.next());
                	
                }
                
                for(Object object : test) {
                    String element = (String) object;
                    System.out.println(element);
                }
                System.out.println("Size of the list is -> "+test.size());
                test.clear();
                System.out.println("blank list ->" + test);
                
                /* String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform(); 
                Thread.sleep(5000);SHI
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);*/
                //driver.close();
                List<String> list = new ArrayList<String>();
                list.add("Data");
                list.add("Data1");
                list.add("Data2");
                list.add("Data3");
                
                String newb = list.get(0);
                 
                for(String loop: list)
                {
                	System.out.println(loop);
                }
                
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                int SIZE = 1000000;
                numbers.ensureCapacity(SIZE);

                for (int i = 0; i < SIZE; i++) {
                    numbers.add(i);
                }
                System.out.println("Number of elements is " + numbers.size());
               numbers.trimToSize();
               System.out.println("Number of elements is " + numbers.size());
               
           	Stack<String> words = new Stack<String>();
    		// append
    		words.push("thrive");
    		words.push("at");
    		words.push("work");	
    		
    		System.out.println("peek " +words.peek());
    		System.out.println(words);
    		System.out.println(words.search("thrive"));
    		System.out.println(words.get(0));
    		System.out.println(words.indexOf("thrive"));
    		List<Integer> ints = new ArrayList<Integer>();
    		ints.add(1);
    		ints.add(2);
    		ints.add(3);
     
    		printList(ints);
    		
    		List<Integer> ints1 = new ArrayList<Integer>();
    	    ints1.add(1);
    	    ints1.add(2);
    	    ints1.add(3);
    	    printSquare(ints1);
                
                
        
	}
}

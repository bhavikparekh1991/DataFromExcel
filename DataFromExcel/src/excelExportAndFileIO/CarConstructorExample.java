package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarConstructorExample {
	private String sModel;
	private int iMake;
	private int iGear;
	private boolean bLeftHandDrive;
    int iHighestSpeed;
    String sColor;
    String sTransmission;
    int iTyres;
    int iDoors;
    char[] test=null;
    String stest ;
    
    
    //Constructor with values passed
    public CarConstructorExample(String Model, int Make,boolean LeftHandDrive ){
    	sModel = Model;
    	iMake = Make;
    	bLeftHandDrive = LeftHandDrive;
    }
    
    //Constructor with default values
    /*public CarConstructorExample(){
    	sModel = "Camry";
    	iMake = 2014;
    	//iGear= 5;
        bLeftHandDrive = true;
      }*/
    
    
 
    //Method
    public void DisplayCharacterstics(){
    	System.out.println("Private variable  - Model - its value is : " +  sModel);
    	System.out.println("Private variable  - Make - its value is : " +  iMake);
    	System.out.println("Private variable  - gear - its value is : " +  iGear);
    	System.out.println("Private variable  - bLeftHandDrive - its value is : " +  bLeftHandDrive);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Transmission of the Car: " +  sTransmission);
    	
    	
    	
    	
    	char[] name = {'b','h','a','v','i','k'};
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] resultName = new char[6];
        String sName ;
        String sResultName ;
        List<String> stringarray = new ArrayList<String>();
        
    	for(int i=0; i<name.length;i++)
        {
        	for(int j=0; j<=alphabets.length;j++)
        	{
        		if(name[i] == alphabets[j])
        		{
        			resultName[i] = alphabets[j+1];
        			break;
        		}
        	}
        }
    	sName = new String(name);
    	sResultName = new String(resultName);
    	System.out.println("Before change -> "+sName);
    	System.out.println(" After change -> "+sResultName);
    	
    	System.out.println("--------------------------------------------------------------------------------");
    	String[] ssname = {"b","h","a","v","i","k"};
    	String[] ssalphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	String[] ssresult = new String[ssname.length];
    	for(int i=0; i<ssname.length;i++)
        {
        	for(int j=0; j<=ssalphabets.length;j++)
        	{
        		if(ssname[i] == ssalphabets[j])
        		{
        			ssresult[i] = ssalphabets[j+1];
        			break;
        		}
        	}
        }
    	
    	StringBuilder strBuilder1 = new StringBuilder();
    	StringBuilder strBuilder2 = new StringBuilder();
    	for (int i = 0; i < ssname.length; i++) {
    		strBuilder1.append(ssname[i]);
    		strBuilder2.append(ssresult[i]);
    	}
    	String newString1 = strBuilder1.toString();
    	String newString2 = strBuilder2.toString();
    	System.out.println(newString1);
    	System.out.println(newString2);
    
    }
}

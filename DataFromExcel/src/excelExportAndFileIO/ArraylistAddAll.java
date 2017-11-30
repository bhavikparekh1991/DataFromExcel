package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;

public class ArraylistAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> test1 = new ArrayList<String>();
		test1.add("ramu");
		test1.add("samu");
		test1.add("tamu");
		List<String> test2 = new ArrayList<String>();
		test2.add("zamu");
		test2.addAll(test1);
		
		System.out.println(" Array List test1 elemets " + test1);
		System.out.println(" Array List test2 elemets " + test2);
		
		Collections.addAll(test2,"ttt","aaa");
		System.out.println(" Array List updated test2 elemets " + test2);
		test2.retainAll(test1);
		System.out.println(" Array List updated test2 elemets " + test2);
		
		ArrayList<String> states = new ArrayList<String>();
        Collections.addAll(states, "Alaska", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
        
        Collection<String> retainThese = Arrays.asList("Colorado", "New York");
        System.out.println(retainThese);
        
        List<String> retainThese1 = Arrays.asList("Colorado", "New York");
        System.out.println(retainThese1);*/
        
       /* String test = "abcd";
        String rtest = "";
        String temp="";
        char[] ctest= test.toCharArray();
        for(int i=ctest.length-1;i>=0;i--)
        {
        	temp = rtest+Character.toString(ctest[i]);
        	rtest = temp;
        }
		System.out.println(rtest);
		String sbtest = new StringBuilder(test).reverse().toString();
		Assert.assertEquals(rtest, sbtest);
		*/
		String a = "bhavik123";
		String r = "";
		List<Integer> num = new ArrayList<Integer>();
		for ( int i = a.length() - 1; i >= 0; i-- ) 
		{
			  /*r = r + a.charAt(i);*/
			r=""+a.charAt(i);
			  try{
				  num.add(Integer.parseInt(r));
			  }
			  catch (Exception e) {
				// TODO: handle exception
			}
			  
		}
	       
		System.out.println(r);
		System.out.println(num);
		
	}

}

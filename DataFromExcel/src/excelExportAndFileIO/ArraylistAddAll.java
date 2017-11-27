package excelExportAndFileIO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> test1 = new ArrayList<String>();
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
        System.out.println(retainThese1);
		
	}

}

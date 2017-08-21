package excelExportAndFileIO;

public abstract class Abstract_Parent {
	// concrete method. Sub class can use it if needed.
		 public void eat() {
		  // do something with food....
			 String food1 = "food";
			 System.out.println(food1);
			 
		 }

		 // concrete method. Sub class can use it if needed.
		 public static void sleep() {
		  // do something with sleep....
		 }

		 // abstract method. Sub classes must have to implement it if extend this class.
		 public abstract void makeNoise();
}

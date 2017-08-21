package excelExportAndFileIO;

public class Abstraction_Sub2 extends Abstract_Parent{
	// abstract method of super class is implemented in sub class.
	 public void makeNoise() {
	  System.out.println("Moo! Moo!");
	 }

	 // Concrete method
	 public void milking() {
	  System.out.println("Cow is milking");
	 }
	 public void eat(String foodfest) {
		  // do something with food....
			 
			 super.eat();
		 }
	 public static void main(String[] args) {
		 Abstract_Parent t=new Abstraction_Sub2();

	        t.eat();
	        Abstraction_Sub2 t1 = new Abstraction_Sub2();
	        t1.milking();
	    }

}

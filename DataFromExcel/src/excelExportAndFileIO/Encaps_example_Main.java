package excelExportAndFileIO;

public class Encaps_example_Main {
	public static void main(String[] args) {
		  //Created object of Encaps class to set and get data.
		  Encaps_example1 encaps = new Encaps_example1();
		  
		  //Set data using setter methods of Encaps class.
		  encaps.setName("Monika");
		  encaps.setrollNo(56);
		  
		  //Get data using getter methods of Encaps class.
		  System.out.println("RollNo : "+encaps.getrollNo()+", Name : "+encaps.getName());
		 }
}

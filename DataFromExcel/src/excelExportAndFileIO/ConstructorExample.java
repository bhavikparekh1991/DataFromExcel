package excelExportAndFileIO;

public class ConstructorExample {
	public static void main(String[] args) {
		//Use the Car keyword to declare Car Class variable
                //Passing values to the constructor
		CarConstructorExample Toyota = new CarConstructorExample("Camry",2014,true);

		Toyota.iDoors = 4;
		//Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.test = new char[]{'t','o','o','l','s'};
		Toyota.stest = new String(Toyota.test);
		System.out.println(Toyota.test);
		System.out.println(Toyota.stest);

		//Using Car class method
		Toyota.DisplayCharacterstics();

	}

}

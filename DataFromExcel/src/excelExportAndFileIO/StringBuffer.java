package excelExportAndFileIO;

public class StringBuffer {
	static String b= "a";
	public static void foo(StringBuilder errorText){ 
		System.out.println(errorText);
        errorText.delete(0, errorText.length());
        errorText.append("bla bla");
    }
	public static void main(String[] args) { 
        StringBuilder error=new StringBuilder("initial");
        foo(error); 
        System.out.println(error);
    }
}

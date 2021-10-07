package firstapp;

public class wrapper {
	public static void main(String[] args) { 
	    Integer myInt = 100; 
	    String myString = myInt.toString();
	    System.out.println(myString.length());
	    Integer myInt1 = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    System.out.println(myInt1.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	  }
}

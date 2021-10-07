package firstapp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lamda {
	interface StringFunction {
		  String run(String str);
		}
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
	    //expression using lambda
	    StringFunction exclaim = (s) -> s + " "+" world";
	    StringFunction ask = (s) -> s + " "+" Andhra";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	  }
	  public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }
	  }


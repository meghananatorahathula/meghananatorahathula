package second;

import java.util.Scanner;

public class oddnum {

	
	public static void main (String[] args){
		
		Scanner reader = new Scanner(System.in) ;
		System.out.println("enter num");
		double num =reader.nextDouble();
		if (num % 2==0){
			System.out.println(num +"  " + "is a even number");
		}
		else{
			System.out.println(num +"  " +" is a odd number");
		}
		
	}
}

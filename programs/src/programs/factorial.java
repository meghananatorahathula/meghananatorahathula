package programs;

import java.util.Scanner;

public class factorial {

	public static void main (String[] args){
	
		System.out.println("enter number:");
		
		Scanner scanner = new Scanner(System.in);
		//Scanner varaiablename = new Scanner(System.in);
		int num = scanner.nextInt();
		
		double factorial = fact(num);
		System.out.println(factorial);
		
		
	}
		//function declaration start 
		static double fact(double n){
		double output;
		
		if (n==1){
			
			return 1;
		}
		
		output =fact(n-1)*n; // call the funtion till n=1 
		return output;
	}
}

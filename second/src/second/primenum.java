package second;

import java.util.Scanner;

public class primenum {
 
	public static void main(String[] args){
		Scanner Reader = new Scanner(System.in);
		System.out.println("enter prime number :");
	    double num = Reader.nextDouble();
	    if (num==0|| num==1)
	    {
	    	System.out.println(num +" " + " is not valid number  ");
	    	
	    }
	    
	    else {
	    	
	    	for (double i=2;i<=num;i++){
	    		if(num%i == 0){
	    			System.out.print(num + " "+ "is not a prime number ");
	    			break;
	    		}
	    		else{
	    			System.out.print(num + " "+" is a prime number");
	    			break;
	    		}
	    	}
	    
	
	
	}
	}
}

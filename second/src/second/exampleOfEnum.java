package second;

import java.util.Scanner;

public class  exampleOfEnum{

public enum typeofinsurances {
	
	LifeInsurance,
	pAndCInsurance,
	GroupInsurance;
	
	


public static void main(String[] args)
{
Scanner TypeOfInsurance = new Scanner(System.in);
System.out.println("enter type of insurance: you want to apply");

String inputOfCustomer = TypeOfInsurance.next();


//typeofinsurances Customerchoice = typeofinsurances.valueOf(inputOfCustomer);
for (typeofinsurances insurancetype : typeofinsurances.values()){
if ( typeofinsurances.equalsIgnoreCase(inputOfCustomer)){
	
	System.out.println(inputOfCustomer +"type insurance policay request has been created"+ "Agent will  contact you soon");
}

}


}

private static boolean equalsIgnoreCase(String inputOfCustomer) {
	// TODO Auto-generated method stub
	return false;
}
}
}
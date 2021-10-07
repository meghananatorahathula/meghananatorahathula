package firstapp;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; 


public class arraylist {
	
	public static void main(String[] args) {
	ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Create an ArrayList object
	myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);/*cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");*/
    //System.out.println(cars);
    for (int i : myNumbers) {
        System.out.println(i);
    }
    /*System.out.println(cars.get(0));
    cars.set(0, "Opel");
   // System.out.println(cars);
    
    cars.remove(0);
    System.out.println(cars);
    */
    //cars.clear();
    //System.out.println(cars);
	}
	
}
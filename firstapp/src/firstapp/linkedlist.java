package firstapp;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
	LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    // Use addFirst() to add the item to the beginning
    cars.addFirst("Mazda");
    System.out.println(cars);
    cars.addLast("bollorow");
    System.out.println(cars);
    cars.removeFirst();
    System.out.println(cars);
    cars.removeLast();
    System.out.println(cars);
   System.out.println(cars.getFirst());
   System.out.println(cars.getLast());
   
    
    
}
}
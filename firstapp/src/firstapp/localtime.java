package firstapp;
import java.time.*;//import local time
import java.time.format.DateTimeFormatter;
public class localtime {
	 public static void main(String[] args) {
	LocalTime myObj = LocalTime.now();
   // System.out.println(myObj);
   // LocalDateTime myObj1 = LocalDateTime.now();
   // System.out.println(myObj1);
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
	 }
}

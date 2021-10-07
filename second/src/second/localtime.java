package second;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localtime {
	public static void main(String[] args) {
		LocalDateTime orderdate;
		orderdate = LocalDateTime.now();
		System.out.println("orderdate " + orderdate);
		String fdate =orderdate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("After formatting date: " + fdate);
	}
	

}

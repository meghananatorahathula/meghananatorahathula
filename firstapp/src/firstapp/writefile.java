package firstapp;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {
	 public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Hello Meghana!!.your are allowed to write in the file sucessfully!!! then start writing it");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

}

package firstapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regx {
	 public static void main(String[] args) {
		    Pattern pattern = Pattern.compile("Meghana", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("Torahathula Meghana");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
		  }
}

package second;
import java.time.LocalDateTime;
import java.time.chrono.*;
public class japanesetime {
	public static void main(String[] args) {
	 LocalDateTime myDate = LocalDateTime.now();
       JapaneseDate jDate = JapaneseDate.from(myDate);	 
      System.out.println("After formatting: " + jDate);
       // date =Integer.parseInt(jDate);
      // System.out.println(jDate);
}
}
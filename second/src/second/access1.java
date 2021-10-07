package second;

import java.lang.reflect.Method;

class outer {    
	  private void display()  
	  {  
	      System.out.println("private method is invoked");  
	  }    
	}      
	   
 class access1 {
	public static void main (String[] args)throws Exception{
		 Class com = Class.forName("outer");    
		    Object o= com.newInstance();    
		    Method m =com.getDeclaredMethod("display", null);    
		    m.setAccessible(true);    
		    m.invoke(o, null);  

}
}
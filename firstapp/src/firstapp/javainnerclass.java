package firstapp;


class OuterClass {
	  int x = 10;

	  class InnerClass{
	   public int InnerMethod(){
	    return x;
	  }
	  }
}
public class javainnerclass {


	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    //System.out.println(myInner.y + myOuter.x);
	    System.out.println(myInner.InnerMethod());
	  }
	}
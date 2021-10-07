package telusko;
class add{
	int a ;
	short b ;
	long n ;
	
	public void perform(){// method
		n =a+b;
	}
	
}
public class cal {

	
	public static void main(String[] args){
		
		add obj = new add();
		obj.a=7;
		obj.b=7;
		obj.perform();//acess method by obj
		System.out.print(obj.n);
		
	}
	
}

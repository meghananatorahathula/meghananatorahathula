package second;

public class subclass extends superclass {
	

	
	int num =5;
	void printnumber(){
		
		System.out.println(super.num);
	}
	public static void main(String[] args){
		
		subclass obj= new subclass();
		//Calling sub class method 
		obj.printnumber();
		
	}

}


public class utilsmethod {
	public static void main(String[] args) {
		utilsmethod theutils = new utilsmethod();
		theutils.dothis();
		System.out.println("go back to main");
	}


	public void dothis(){
		try {
			dothat();
		
		}
		
	
	catch(Exception e){
		System.out.println("do this - " + "exception caught" + e.getMessage());
		
	}
	}
	
	public void dothat() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("dothat :" + "throwing exception");
		throw new Exception("ouch!!");
		
		
	}
	}



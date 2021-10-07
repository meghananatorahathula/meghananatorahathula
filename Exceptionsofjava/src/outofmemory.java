
public class outofmemory {
	
	
	
	
	public void setName(String newName) {
	
	}
	public static void main(String[] args) {
		outofmemory thelist = new outofmemory();
		while (true){
			
		String thestring = "testing the array";
		thelist.add(thestring);
		long size = thelist.size();
		
		if (size % 1000000== 0){
			System.out.println("list has" + size/1000000 + "million elements");
		}
		}
	}

	private void add(String thestring) {
		// TODO Auto-generated method stub
		
	}

	private long size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package second;

public class person extends details {
	
	public static void main(String[] args){
		
		person data = new person();
		data.setName("Meghana Torahathula");
		person data2 = new person();
		data2.setage(21);
		System.out.println(data.getName());
		System.out.println(data2.getage());
	}

}

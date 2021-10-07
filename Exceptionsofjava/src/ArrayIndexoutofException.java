
public class ArrayIndexoutofException {
	int[] array;
	public ArrayIndexoutofException(int size){
		array = new int[size];
	}
		public void addelement(int index, int value){
			array[index] = value;
		
	}
	
	public static void main(String[] args) {
		ArrayIndexoutofException mytestarray = new ArrayIndexoutofException(5);
		mytestarray.addelement(5, 23);
	}

}

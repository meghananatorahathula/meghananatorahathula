package second;


class shirt { // Superclass (parent)
	  public void getdiscount() {
	    System.out.println("you have purchased a shirt");
	  }
	}

	class discount extends shirt { // Subclass (child)
	  public void getdiscount() {
	    super.getdiscount(); // Call the superclass method
	    System.out.println("you have got 50% discount");
	  }
	}

public class shoppingcart {
	
	public static void main(String[] args) {
	
		shirt total = new discount();
		 total.getdiscount();
	
			
		}
	
		
	}
	


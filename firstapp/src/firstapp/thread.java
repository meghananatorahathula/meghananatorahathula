package firstapp;

	public class thread extends Thread {
		public static int amount = 0;
		  public static void main(String[] args) {
		    thread thread1 = new thread();
		    thread1.start();
		    System.out.println(amount);
		    amount++;
		    //System.out.println("/n");
		    System.out.println();
		    System.out.println(amount);
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
			  amount++;
		    System.out.println("This code is running in a thread");
		  }
		}



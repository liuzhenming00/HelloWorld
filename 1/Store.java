public class Store{
	// main method is where we create instances!
	public static void main(String[] args) {
		
		System.out.println("This code is inside the main method.");
		 // create the instance below
		Store st = new Store();
		
		System.out.println(st);
		
		  // print the instance below
	}
	 // new method: constructor!
		public Store() {
			System.out.println("I am inside the constructor method.");
		}
		}
package week7OutOfMemory;

public class OutOfMemory {
	public static void main(String[] args) {
		
		try {
			// Integer Array with a large value
			int[] list = new int[2000000000];
		}
		
		// The exception will just print out a message if the list is too large
		catch (Error ex) {
			ex.printStackTrace();
			System.out.println("You are running out of memory.");
		}

		System.out.println("GO");

		System.out.println("Wait");
	}
}
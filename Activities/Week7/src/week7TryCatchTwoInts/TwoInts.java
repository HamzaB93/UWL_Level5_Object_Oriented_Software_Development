package week7TryCatchTwoInts;

import java.util.Scanner;

public class TwoInts {
	public static void main(String[] args) {
		
		/*
		 * Error handling with two integers from the user
		 */
		
		// Making a scanner for user input
		Scanner input = new Scanner(System.in);

		// Boolean for user entry loop
		boolean done = false;
		int number1 = 0;
		int number2 = 0;
		
		// Enter two integers
		System.out.print("Enter two integers: ");

		while (!done) 
		{
			// Try and...
			try {
				// ... Enter two numbers
				System.out.println("Enter the first integer: ");
				number1 = input.nextInt();
				System.out.println("Now the second integer:  ");
				number2 = input.nextInt();
				// Done will then be true so loop will end
				done = true;
			}
			
			// Catch the exception
			catch (Exception ex) {
				// Print the stack trace of errors
				ex.printStackTrace();
				// Notify the user of wrong entry
				System.out.print("Incorrect input and re-enter two integers: ");
				// Discard input and loop again because its still not done
				input.nextLine(); 
			}
		}

		// When done, provide the answer
		System.out.println("Sum is " + (number1 + number2));
	}
}
package assignment;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.ArrayList;

public class Client 
{
	private Client() {}

	public static void main (String[] args)
	{
		// Reference to host name
		String host = "localHost";

		// Variable for the menu
		boolean active = true;

		// Variable for try catch entry
		boolean done = false;

		// Making a scanner object
		Scanner input = new Scanner(System.in);

		// Variable for the Users chosen option in the menu
		String option;

		// Variables for the Student entry
		int id;
		String fName;
		String sName;
		int age; 
		String course;

		// Variable for reply to the client
		String response;

		try {
			// Locate the registry for the localHost
			Registry registry = LocateRegistry.getRegistry(host);
			// Reference and lookup the registry with appropriate names
			UniInterface stub = (UniInterface) registry.lookup("Uni");

			// Calling the makeUni method from the stub
			// Makes an arrayList called uni
			stub.makeUni();

			// Notification for Client
			System.out.println("Welcome! You have entered the University Server.\n");
			System.out.println("Select from these options: ");

			// Menu for the Client
			while (active != false)
			{
				System.out.println("Add a student, enter 1 \nEdit a student, enter 2\nFind a student, enter 3 \n"
						+ "Print out a list of student, enter 4 \nTo quit, enter q");

				// Client selects option
				option = input.next();

				switch(option)
				{
				case "1":
					// Prompt
					System.out.println("Now enter the details for the student");

					// Client will enter the Students details
					System.out.println("Enter the student's first name:");
					fName = input.next();
					System.out.println("Enter the student's second name:");
					sName = input.next();
					System.out.println("Enter the student's age:");
					age = input.nextInt();
					System.out.println("Enter the student's course code");
					course = input.next();

					// The client calls the addAStudent from the stub and enters the parameters
					response = stub.addAStudent(fName, sName, age, course);
					// Client prints out response
					System.out.println(response + "\n");

					break;

				case "2":
					// Prompt
					System.out.println("Edit a student");

					// Client entry
					// Client will enter the Students details
					System.out.println("First enter the student's id:");
					id = input.nextInt();
					System.out.println("Enter the student's first name (Enter . If you don't want to edit this!!):");
					fName = input.next();
					System.out.println("Enter the student's second name (Enter . If you don't want to edit this!!):");
					sName = input.next();
					System.out.println("Enter the student's age (Enter 0 If you don't want to edit this!!):");
					age = input.nextInt();
					System.out.println("Enter the student's course code (Enter . If you don't want to edit this!!):");
					course = input.next();

					// The client calls the addAStudent from the stub and enters the parameters
					response = stub.editAStudent(id, fName, sName, age, course);
					// Client prints out response
					System.out.println(response + "\n");

					break;

				case "3":
					// Prompt
					System.out.println("Now enter the ID of the student you want to find");

					// Client enters Student ID
					System.out.println("Student ID:");
					id = input.nextInt();

					// Client calls the findAStudent from the stub and gives the id
					response = stub.findAStudent(id);

					System.out.println(response);

					break;

				case "4":
					// Prompt
					System.out.println("Here is the list of Students\n");

					// Client calls the printOutStudents from the stub
					response = stub.printOutStudents();

					// The server returns the details and they are printed
					System.out.println(response);

					break;

				case "q":
					active = false;
					break;

				case "/0":
					break;

				default:
					System.out.println("Incorrect entry!");
					break ;
				} 
			}
		}
		catch (Exception e)
		{
			System.out.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
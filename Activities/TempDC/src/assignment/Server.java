package assignment;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

//Implements the UniInterface
public class Server implements UniInterface
{
	// Array of Student objects
	public ArrayList<Student>uni;

	// Server Constructor
	public Server() {}

	// METHOD INVOKED BY CLIENT

	// Constuctor for ArrayList
	public void makeUni()
	{
		uni = new ArrayList<Student>();
	}

	// Add a Student object to the uni ArrayList
	public void addToList(Student studentToAdd)
	{
		uni.add(studentToAdd);
	}

	// Create a Student object and add them to the uni
	public String addAStudent(String fName, String sName,int age, String course)
	{
		// Construct student with given parameters
		Student stud = new Student(fName, sName, age, course);

		// Add stud to the uni ArrayList 
		addToList(stud);

		// Returns a String confirmation to the Client program - uses Student Class methods
		return "Student with ID: " + stud.getId() + " and Name: " + stud.getFName() + " " + stud.getSName() 
				+" has been successfully added";
	}

	// Edit an existing Student
	public String editAStudent(int id, String fName, String sName, int age, String course)
	{
		for(int i = 0 ; i < uni.size() ; i ++)
		{		
			
			if (uni.get(i).getId() == id) {
				
				if (!fName.equals(".")) {
					uni.get(i).setFName(fName);
				}
				
				if (!sName.equals(".")) {
					uni.get(i).setSName(sName);
				}
				
				if (age != 0) {
					uni.get(i).setAge(age);
				}
				
				if (!course.equals(".")) {
					uni.get(i).setCourse(course);
				}
				
				return "The student of ID: " + id + " has been edited. \n" + uni.get(i).toString();
			}
		}

		// Otherwise return that the Student wasn't found
		return "Student of ID: " + id + " wasn't found" ; 
	}

	// For user to find a student
	public String findAStudent(int id)
	{
		// Loop through the uni arrat
		for(int i = 0 ; i < uni.size() ; i++)
		{
			// Make a Student with the current index values
			Student temp = uni.get(i);

			// If the Students id matches the given id
			if(temp.getId() == id)
			{
				// Return the toString value of the temp Student to the client
				return temp.toString();
			}
		}

		// Otherwise return that the Student wasn't found
		return "Student of ID: " + id + " wasn't found" ;
	}

	// For user to print out the students
	public String printOutStudents()
	{
		// Make a string value
		String list = "";

		// Advanced for loop
		// For the Student objects in uni ArrayList
		for (Student stud : uni)
		{
			// Add the students to the string list value
			list += stud + "\n"; 
		}

		// Return the string list to the client
		return list;
	}


	public static void main (String args[])
	{
		try {
			// Making a new server object
			Server obj = new Server();
			// Making a stub and exporting the object to be remote
			UniInterface stub = (UniInterface) UnicastRemoteObject.exportObject(obj, 0);
			// Getting the local registry
			Registry registry = LocateRegistry.getRegistry();
			// Binding a name to the stub so the client can reference it
			registry.bind("Uni", stub);

			System.err.println("Server ready");
		}
		catch(Exception e) {
			System.err.println("Server Exception: " +  e.toString());
			e.printStackTrace();
		}
	}
}
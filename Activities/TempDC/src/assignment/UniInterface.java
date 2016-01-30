package assignment;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

// Interface shared by the server and client
// Extends Remote to make the methods remote
public interface UniInterface extends Remote
{
	// For user to make a uni ArrayList
	void makeUni() throws RemoteException;

	// For user to add a student to the uni ArrayList
	String addAStudent(String fName, String sName, int age, String course) throws RemoteException;

	// For user to edit a student
	String editAStudent(int id, String fName, String sName, int age, String course) throws RemoteException; 

	// For user to find a student with a given id from the ArrayList
	String findAStudent(int id) throws RemoteException;

	// For user to print out all the students from the ArrayList
	String printOutStudents() throws RemoteException;

}

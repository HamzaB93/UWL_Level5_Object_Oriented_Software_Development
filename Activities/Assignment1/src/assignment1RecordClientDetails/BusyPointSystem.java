package assignment1RecordClientDetails;

import java.util.ArrayList;

public class BusyPointSystem 
{
	////////// Properties //////////
	
	// Array of staff
	private ArrayList<BpStaff>staff;
	// Array of clients
	private ArrayList<Client>clients;
	
	////////// RECORD CLIENT DETAILS //////////
	
	// This method will be triggered by the client
	// They will need to give a company name, their address and an email as arguments
	public void recordClientDetails(String companyName, ClientAddress address, String email)
	{
		// Defining a new Client object
		Client cl;
		
		// Defining a new boolean found which defined as false
		boolean found = false;
		
		// Check Staff availability
		// The system loops through the arrayList of staff
		for (int i = 0; i < staff.size(); i++) 
		{
			// It gets the staff at an index and uses BpStaff method isAvailable
			// If the staff availability it true...
			if (staff.get(i).isAvailable()) 
			{
				// ... a new client will be constructed and use the staff at the current index as
				//  associated staff along with the given arguments
				cl = new Client (companyName, address, email, staff.get(i));
				
				// The client is then added to the clients arrayList
				addClient(cl);
				
				// The client is given confirmation that their details have been recorded
				System.out.println("Congratulations, your details have been saved in our system");
				
				// The client will also be notified of the staff members name
				System.out.println("Your contact person is " + staff.get(i).getNameOfStaff());
				
				// The found value will be changed to true
				found = true;
				
				// The if statement and loop will be broken out of.
				// This is done to prevent more than on staff being assigned to one client
				break;
			}
		}
		
		// If found is still equal to false, meaning no staff was found...
		if (found == false) 
		{
			// .., a client is still constructed with the given arguments but without an associated staff 
			cl = new Client (companyName, address, email);
			
			// The client is added to the clients arrayList
			addClient(cl);
			
			// A confirmation is given to the client
			System.out.println("Congratulations, your details have been saved in our system");
			// They are also given a notification that no staff was found but will be given one later
			System.out.println("Currently we have no staff available to handle you."
			+" You will be assigned one at a later date.");
		}
	}

	////////// Constructor //////////
	
	// Allows the BusyPointSystem to be constructed
	public BusyPointSystem()
	{
		// Also constructs arrayLists for BpStaff and their clients
		staff = new ArrayList<BpStaff>();
		clients = new ArrayList<Client>();
	}
	
	///////// ArrayList add methods //////////
	
	// Adding to the staff ArrayList
	public void addStaff(BpStaff staffToAdd)
	{
		staff.add(staffToAdd);
	}
	
	// Adding to clients ArrayList
	public void addClient(Client clientToAdd)
	{
		clients.add(clientToAdd);
	}
	
	//////// ArrayList print methods //////////
	
	// Printing the staff ArrayList
	public void printStaffList()
	{
		System.out.println("BusyPoint Staff List: ");
		for(int i = 0 ; i < staff.size() ; i++)
		{
			System.out.println(staff.get(i));
		}
	}
	
	// Printing the staff ArrayList
	public void printClients()
	{
		System.out.println("BusyPoint Client List: ");
		for(int i = 0 ; i < clients.size() ; i++)
		{
			System.out.println(clients.get(i));
		}
	}
	
}

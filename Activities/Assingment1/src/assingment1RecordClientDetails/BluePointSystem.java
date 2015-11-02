package assingment1RecordClientDetails;

import java.util.ArrayList;

public class BluePointSystem 
{
	////////// Properties //////////
	
	// Array of staff
	private ArrayList<BpStaff>staff;
	// Array of clients
	private ArrayList<Client>clients;
	
	
	////////// RECORD CLIENT DETAILS //////////
	public boolean recordClientDetails(String companyName, ClientAddress address, String email)
	{
		Client cl;
		
		// Check Staff availability
		
		for (BpStaff temp : staff) {
			
			if (temp.isAvailable()) {
				cl = new Client (companyName, address, email, temp);
				addClient(cl);
				System.out.println("Congratulations, your details have been saved in our system");
				System.out.println("Your contact person is " + temp.getNameOfStaff());
				return true;
			}
			
		}
		
		cl = new Client (companyName, address, email);
		addClient(cl);
		System.out.println("Congratulations, your details have been saved in our system");
		System.out.println("Currently we have no staff available to handle you."
		+" You will be assigned one later.");	
		return false;
	}
	
	
	////////// Constructor //////////
	
	// Creating the ArrayList for staff and clients
	public BluePointSystem()
	{
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
		System.out.println("Here Is The List Of Staff");
		for(int i = 0 ; i < staff.size() ; i++)
		{
			System.out.println(staff.get(i));
		}
	}
	
	// Printing the staff ArrayList
	public void printClients()
	{
		System.out.println("Here Is The List Of Clients");
		for(int i = 0 ; i < clients.size() ; i++)
		{
			System.out.println(clients.get(i));
		}
	}
	
}

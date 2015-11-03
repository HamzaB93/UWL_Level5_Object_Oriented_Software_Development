package assignment1RecordClientDetails;

public class BusyPointSystemTest 
{
	public static void main(String[] args) 
	{
		/*
		 * THIS IS A TEST CLASS.
		 * IT TESTS THE USE OF THE RECORDCLIENTDETAILS METHOD
		 */
		
		// First the BusyPoint object must be constructed
		/*
		 * When it is constructed, two arrayLists will also be constructed.
		 * One will contain BpStaff objects called staff.
		 * Another will contain Client objects called clients
		 */
		BusyPointSystem bpSystem = new BusyPointSystem();
		
		// Constructing different staff of type BpStaff
		/*
		 * The attributes are String nameOfStaff, String jobDescription and boolean available.
		 * Because of inheritance AccountManager, Advertising and directors inherit BpStaff methods
		 */
		BpStaff b1 = new BpStaff("Jim Addams", "Staff", true);
		BpStaff b2 = new AccountManager("Gail Williams", "Account Manager", false);
		BpStaff b3 = new Advertising("David Spademan", "Advertising", true);
		BpStaff b4 = new Director("Eva Brown", "Director", false);
		
		// Adding BpStaff objects to staff arrayList
		bpSystem.addStaff(b1);
		bpSystem.addStaff(b2);
		bpSystem.addStaff(b3);
		bpSystem.addStaff(b4);
		
		// Proof that the objects have been added to the arrayList
		bpSystem.printStaffList();
		System.out.println("");
		
		////////// recordClientDetails //////////
		/*
		 * The Client must provide a companyName, an address, and email
		 */
		// Constructing a ClientAddress, including buildingNumber, buildingName, buildingPostCode
		ClientAddress c1Address = new ClientAddress(566, "Galavan House", "PB4 443");
		
		// Calling the recordClientDetailsMethod
		/*
		 * The system will find available staff from the staff arrayList
		 * The first staff member it find to be available, will assigned to the client
		 * The client is then added to the clients arrayList
		 */
		bpSystem.recordClientDetails("Monitors For Us", c1Address, "monitorsforus@mfu.co.uk");
		System.out.println("");
		
		// Setting BpStaff object b1 availability to false and recording a new client's details
		b1.setAvailable(false);
		ClientAddress c2Address = new ClientAddress(781, "Gotham Place", "B47 M4N");
		// In this case BpStaff b3 will be assigned to the new customer
		bpSystem.recordClientDetails("Wayne Industries", c2Address, "wayneindustries@gotham.com");
		System.out.println("");
		
		// Recording another client's details and should be assigned to BpStaff b3 also
		ClientAddress c3Address = new ClientAddress(12, "Metropolis House", "ME1 S00");
		bpSystem.recordClientDetails("Daily Planet", c3Address, "dailyplanet@metropolis.org");
		System.out.println("");
		
		// Recording a client's details where no staff is available
		b3.setAvailable(false);
		ClientAddress c4Address = new ClientAddress(100, "Star Labs", "CC1 F45");
		// This client will not have BpStaff member assigned. The details will still be recorded
		bpSystem.recordClientDetails("Star", c4Address, "staralabs@centralcity.com");
		System.out.println("");
		
		// Showing that all Client objects have been added to the clients arrayList
		bpSystem.printClients();
		
		
	}
}

package assingment1RecordClientDetails;

public class BluePointSystemTest 
{
	public static void main(String[] args) 
	{
		// Making the system
		BluePointSystem bpSys = new BluePointSystem();
		
		// Making staff
		BpStaff b1 = new BpStaff();
		BpStaff b2 = new Advertising();
		BpStaff b3 = new AccountManager();
		BpStaff b4 = new Director();
		
		// Adding staff to the ArrayList
		bpSys.addStaff(b1);
		bpSys.addStaff(b2);
		bpSys.addStaff(b3);
		bpSys.addStaff(b4);
		
		// Printing staff array
		bpSys.printStaffList();
		
		// Making Clients
		
		// First client with b1 associatedStaff
		String c1Name = "Hamza inc";
		ClientAddress c1Address = new ClientAddress();
		String c1Email = "HI@inc.com";
		Client c1 = new Client(c1Name, c1Address, c1Email, b1);
		
		// Second Client with b2
		String c2Name = "Amrit inc";
		int c2BuildingNumber = 3;
		String c2BuildingName = "Amrit Offices";
		String c2BuildingPostCode = "UB1 678";
		ClientAddress c2Address = new ClientAddress(c2BuildingNumber, c2BuildingName, c2BuildingPostCode);
		String c2Email = "AI@am.com";
		Client c2 = new Client(c2Name, c2Address, c2Email, b4);
		
		// Third Client with no staff
		String c3Name = "Random";
		ClientAddress c3Address = new ClientAddress();
		String c3Email = "Random@random.com";
		Client c3 = new Client(c3Name, c3Address, c3Email);
		
		// Adding Clients to ArrayList
		bpSys.addClient(c1);
		bpSys.addClient(c2);
		bpSys.addClient(c3);
		
		// Printing clients array
		System.out.println("\n");
		bpSys.printClients();
		
	}
}

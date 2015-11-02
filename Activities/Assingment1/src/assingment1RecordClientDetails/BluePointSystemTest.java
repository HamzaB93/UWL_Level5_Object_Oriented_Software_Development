package assingment1RecordClientDetails;

public class BluePointSystemTest 
{
	public static void main(String[] args) 
	{
		// Making the system
		BluePointSystem bpSys = new BluePointSystem();
		
		// Making staff
		String b1NameOfStaff = "Peter Dood";
		String b1JobDescription = "Staff";
		boolean b1Available = false;
		BpStaff b1 = new BpStaff(b1NameOfStaff, b1JobDescription, b1Available);
		
		String b2NameOfStaff = "John Dood";
		String b2JobDescription = "Advertising";
		boolean b2Available = false;
		BpStaff b2 = new Advertising(b2NameOfStaff, b2JobDescription, b2Available );
		
		BpStaff b3 = new BpStaff();
		
		// Adding staff to list
		bpSys.addStaff(b1);
		bpSys.addStaff(b2);		
		
		
		//////////// Starting recordClientDetails //////////
		
		// Making a client
		String c1Name = "Hamza Inc";
		ClientAddress c1Address = new ClientAddress();
		String c1Email = "hamza@hamzainc.com";
		
		bpSys.recordClientDetails(c1Name, c1Address, c1Email);
		
	}
}

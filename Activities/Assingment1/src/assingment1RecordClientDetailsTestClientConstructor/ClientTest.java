package assingment1RecordClientDetailsTestClientConstructor;

public class ClientTest 
{
	public static void main(String[] args) 
	{
		BpStaff adv = new Advertising();
		
		String compName = "comp name";
		ClientAddress address = new ClientAddress();
		String email = "email.com";
		
		Client client = new Client(compName, address, email, adv);
		
		System.out.println("Test\n" + client.toString2());
		
		
		BpStaff bp = new BpStaff();
		Client client2 = new Client(compName, address, email, bp);
		System.out.println("Test2\n" + client2.toString2());
	}
}

package factoryDesignPattern;

public class BpStaffFactoryTest {

	public static void main(String[] args) 
	{
		BpStaffFactory factory = new BpStaffFactory();
		
		BpStaff s1 = factory.makeStaff("John Jane", "Account Manager", true);
		BpStaff s2 = factory.makeStaff("Jim Jam", "Advertising", true);
		BpStaff s3 = factory.makeStaff("Jim Jane", "Director", false);

		System.out.println(s3);
		
		ClientAddress ad1 = new ClientAddress();
		Client c1 = new Client("Star Labs", ad1, "sl@centralcity.dc", s1);
		System.out.println(c1);
	}
}

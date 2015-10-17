package week2Aggregation;

import java.util.Date;

public class MemberTest 
{
	public static void main(String[] args) 
	{
		// Construct an Address
		Address ad = new Address(65, "Random road", "London", "UB1 11T");
		
		// Construct a default member
		Member mem = new Member();
		
		// getting name
		String name = mem.getName();
		System.out.println("Member name: " + name);
		
		// getting dateCreated
		Date dt = mem.getDateCreated();
		System.out.println("Date created: " + dt);

		// getting address
		Address address = mem.getMainAddress();
		System.out.println("Address: " + address);
		
		
		// Construct member
		Date date = new Date();
		Member mem2 = new Member(1010, "Hamza Bhatt", date, ad);
		
		// Get mem2 address
		Address address2 = mem2.getMainAddress();
		System.out.println("Mem2 address: " + address2);
		
		String mem2Details = mem2.toString();
		
		System.out.println(mem2Details);
		
	}

}

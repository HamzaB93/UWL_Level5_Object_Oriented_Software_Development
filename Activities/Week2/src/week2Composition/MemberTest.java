package week2Composition;

import java.util.Date;

public class MemberTest 
{
	public static void main(String[] args) 
	{
		
		// Constructing an address
		Address address = new Address(65, "Nowhere Lane", "Amrite City", "UR1");
		
		// Construct a Loan
		Date date = new Date(); 
		Loan loan = new Loan(5, 3, 500.00, date);
		
		// Construct a Member
		Member hamza = new Member(21223241, "Hamza Bhatti", date, address, loan);
		
		String memDetails = hamza.toString();
		System.out.println(memDetails);
		
		// Adding a new Loan
		Loan loan2 = new Loan(10.00, 5, 100.00, date);
		hamza.addLoan(loan2);
		
		memDetails = hamza.toString();
		System.out.println(memDetails);
		
	}

}

// long id, String name, Date dateCreated, Address mainAddress, Loan loans
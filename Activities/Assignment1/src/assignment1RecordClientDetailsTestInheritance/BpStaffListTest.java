package assignment1RecordClientDetailsTestInheritance;

import assignment1RecordClientDetails.AccountManager;
import assignment1RecordClientDetails.Advertising;
import assignment1RecordClientDetails.Director;

public class BpStaffListTest {

	public static void main(String[] args) 
	{
		// Making a new arrayList
		BpStaffList bpStaff = new BpStaffList();
		
		// Making inherited staff
		AccountManager actMan = new AccountManager();
		Advertising advStaff = new Advertising();
		Director directStaff = new Director();
		
		// Add to the list
		bpStaff.addStaff(actMan);
		bpStaff.addStaff(advStaff);
		bpStaff.addStaff(directStaff);
		
		// Printing it
		bpStaff.printStaffList();
	}

}

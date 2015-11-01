package assingment1RecordClientDetailsTestInheritance;

import assingment1RecordClientDetails.AccountManager;
import assingment1RecordClientDetails.Advertising;
import assingment1RecordClientDetails.Director;

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

package assignment1RecordClientDetailsTestInheritance;

import java.util.ArrayList;

import assignment1RecordClientDetails.BpStaff;

public class BpStaffList 
{
	// making an array of BpStaff
	private ArrayList<BpStaff>bpStaff;
	
	// Constructing an arrayList
	public BpStaffList()
	{
		bpStaff = new ArrayList<BpStaff>();
		
	}
	
	// Add method
	public void addStaff(BpStaff staffToAdd)
	{
		bpStaff.add(staffToAdd);
	}
	
	// Print method
	public void printStaffList()
	{
		for(int i = 0; i < bpStaff.size() ; i++)
		{
			System.out.println(bpStaff.get(i));
		}
	}
	
}

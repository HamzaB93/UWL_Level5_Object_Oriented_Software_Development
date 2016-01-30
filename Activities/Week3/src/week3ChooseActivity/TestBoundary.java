package week3ChooseActivity;

public class TestBoundary 
{
	public static void main(String[] args) 
	{

		// Making a child
		Child1 hamza = new Child1("Hamza Bhatti", 4, "65 Weirdo Lane", true);
		
		// Testing the listActivities
		// First a boundary must be made so the methods can be accessed
		Boundary1 boundary = new Boundary1();
		
		System.out.println("Retrieving the list of activities\n");
		System.out.println(boundary.listActivities(hamza));
	
		// Empty line
		System.out.println("");
		
		// Choosing an activity where the user must enter the name
		System.out.println("Getting the details of the Running activity");
		System.out.println(boundary.chooseActivity("Running"));
	}
}
/*
private String name;
private int age;
private String address;
private boolean status; */
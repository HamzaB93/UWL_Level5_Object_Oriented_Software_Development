package week3ChooseActivity2;

public class TestClass 
{

	public static void main (String[] args) 
	{
	
		Child child1 = new Child("Bob", 12, "London", true);
		
		Boundary boundary = new Boundary();
		
		System.out.println(boundary.listActivities(child1));
		System.out.println(boundary.chooseActivity("Jim"));
	
	}
	
}
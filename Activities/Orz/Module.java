package Week8;

public class Module 
{
	// declare variables
	String code;
	String title;
	int level;
	int cwWeight;
	int exWeight;
	
	// default constructor 
	public Module()
	{
		code = "??????";
		title = "No title";
		level = 0;
		cwWeight = 50;
		exWeight = 50;
	}
		
	// constructor with parameters
	public Module(String code, String title, int level, int cwWeight, int exWeight)
	{
		this.code = code;
		this.title = title;
		this.level = 0;
		this.cwWeight = 50;
		this.exWeight = 50;
	}
	
	// print method
	public void print()
	{
		System.out.println("code is "+code);
		System.out.println("title is "+title);
		System.out.println("level is "+level);
		System.out.println("cwWeight is "+cwWeight);
		System.out.println("exWeight is "+exWeight);
	}	
}

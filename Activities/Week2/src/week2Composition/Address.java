package week2Composition;

public class Address 
{
	////////// Properties //////////
	
	private int houseNum;
	private String roadName;
	private String city;
	private String postCode;
	
	////////// Constructors //////////
	
	// Default constructor
	public Address()
	{
		houseNum = 0;
		roadName = "Unkown Road Name";
		city = "Unkown City";
		postCode = "Unknown Post Code";
	}
	
	// Parameterised constructor
	public Address (int houseNum, String roadName, String city, String postCode)
	{
		this.houseNum = houseNum;
		this.roadName = roadName;
		this.city = city;
		this.postCode = postCode;
	}
	
	////////// toString() //////////
	public String toString()
	{
		return("House Number: " + houseNum + ", Road Name: " + roadName + ", City: " + city + ", Post Code: " + postCode);
	}
}

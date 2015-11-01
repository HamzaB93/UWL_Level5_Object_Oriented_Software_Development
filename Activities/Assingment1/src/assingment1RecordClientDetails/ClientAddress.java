package assingment1RecordClientDetails;

public class ClientAddress 
{
	////////// Properties //////////
	private int buildingNumber;
	private String buildingName;
	private String buildingPostCode;
	
	////////// Constructors //////////
	
	// Default - Creating an object with predefined values
	public ClientAddress()
	{
		buildingNumber = 0;
		buildingName = "Building name unknown";
		buildingPostCode = "Unknown Post Code";
	}
	
	// Parameterised - Creating an object with user defined values for the object properties
	public ClientAddress(int buildingNumber, String buildingName, String buildingPostCode)
	{
		this.buildingNumber = buildingNumber;
		this.buildingName = buildingName;
		this.buildingPostCode = buildingPostCode;
	}
	
	////////// toString //////////
	
	// Will give a string representation of the object
	public String toString()
	{
		return ("Building Number: " + buildingNumber + ", Building Name: " + 
				", PostCode: " + buildingPostCode);
	}
	
	////////// Getters and Setters //////////
	
	// Getters - Getting the values of the properties
	public int getBuildingNumber() 
	{
		return buildingNumber;
	}

	public String getBuildingName() 
	{
		return buildingName;
	}
	
	public String getBuildingPostCode() 
	{
		return buildingPostCode;
	}
	
	// Setters - Setting a different value for the object properties
	public void setBuildingNumber(int buildingNumber) 
	{
		this.buildingNumber = buildingNumber;
	}

	public void setBuildingName(String buildingName) 
	{
		this.buildingName = buildingName;
	}

	public void setBuildingPostCode(String buildingPostCode) 
	{
		this.buildingPostCode = buildingPostCode;
	}
}

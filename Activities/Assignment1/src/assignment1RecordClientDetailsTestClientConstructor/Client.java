package assignment1RecordClientDetailsTestClientConstructor;

public class Client 
{
	////////// Properties //////////
	private int id;
	private static int baseId = 10;
	private String companyName;
	private ClientAddress address;
	private String email;
	private BpStaff associatedContact;

	////////// Constructors //////////

	// Parameterised
	// When BpStaff is unavailable
	public Client(String companyName, ClientAddress address, String email)
	{
		id = baseId;
		baseId++;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
	}
	
	// Parameterised
	// When BpStaff is available
	public Client(String companyName, ClientAddress address, String email, BpStaff associatedContact)
	{
		id = baseId;
		baseId++;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
		this.associatedContact = associatedContact;
	}
	
	////////// toStrings //////////
	// Without an associatedContact
	public String toString()
	{
		return ("Client details:\n Client ID: " + id + ", Company Name: " + companyName +", Address: " + address +
				", Email: " + email);
	}
	
	// With an associatedContact
	public String toString2()
	{
		return ("Client details:\n Client ID: " + id + ", Company Name: " + companyName +", Address: " + address +
				", Email: " + email + ", BluePoint associated staff: " + associatedContact);
	}
	////////// Getters and Setters //////////
	
	// Getters
	public int getId() 
	{
		return id;
	}
	
	public String getCompanyName() 
	{
		return companyName;
	}
	
	public ClientAddress getAddress() 
	{
		return address;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public BpStaff getAssociatedContact() 
	{
		return associatedContact;
	}
	
	// Setters
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	public void setAddress(ClientAddress address) 
	{
		this.address = address;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public void setAssociatedContact(BpStaff associatedContact) 
	{
		this.associatedContact = associatedContact;
	}
}

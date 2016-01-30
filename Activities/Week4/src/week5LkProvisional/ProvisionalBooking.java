package week5LkProvisional;

public class ProvisionalBooking 
{
	////////// Properties //////////
	private Caravan bookedCaravan;
	private String customerId;
	
	// Base booking is a static property. This will allow other objects to use this property
	private static int baseBookingNum = 1000;
	private int bookingNumber;
	
	////////// Constructors //////////
	
	// Default
	public ProvisionalBooking()
	{
		
	}

	// Parameterised
	
	// Takes a Caravan object and a string customer id
	public ProvisionalBooking(Caravan bookedCaravan, String customerId)
	{
		this.bookedCaravan = bookedCaravan;
		this.customerId = customerId;
		bookingNumber = baseBookingNum;
		baseBookingNum++;
	}

	public Caravan getBookedCaravan() {
		return bookedCaravan;
	}

	public void setBookedCaravan(Caravan bookedCaravan) {
		this.bookedCaravan = bookedCaravan;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public int getBookingNumber() {
		return bookingNumber;
	}
}

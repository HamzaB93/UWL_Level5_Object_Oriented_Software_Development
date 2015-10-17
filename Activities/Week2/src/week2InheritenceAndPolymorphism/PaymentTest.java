package week2InheritenceAndPolymorphism;

public class PaymentTest 
{
	public static void main(String[] args) 
	{
		// Constructing a payment
		Payment payment1 = new Payment(100.00);
		
		// Getting payment
		double gettingPayment = payment1.getAmount();
		System.out.println("The payment made is £" + gettingPayment);
		
		
		// Making a Cash payment
		Cash cash1 = new Cash();
		
		// Using Payment method,  setting and getting the payment
		cash1.setAmount(60.00);
		double gettingPayment2 = cash1.getAmount();
		System.out.println("The payment made is £" + gettingPayment2);
		
		
		// Making check
		Check check1 = new Check("Hamza Bhatti" , 1122, 222.00);
		
		//check1.setAmount(200.00);
		double gettingPayment3 = check1.getAmount();
		System.out.println("Check amount is £" + gettingPayment3);
	}
}

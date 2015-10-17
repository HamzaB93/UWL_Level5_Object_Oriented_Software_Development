package week2Encapsulation;

public class LoanTest {
	
	public static void main(String[] args) 
	{
		
		// Construct new Loan, default and 
		Loan loan1 = new Loan();
		
		Loan loan2 = new Loan(0.05, 4, 200.00, "28/09/2015");
		
		// setting and getting
		loan2.setAnnualInterestRate(0.1);
		double rate = loan2.getAnnualInterestRate();
		System.out.println("Loan 2 rate is: " + rate);
		
		loan1.setLoanAmount(900.00);
		double amount = loan1.getLoanAmount();
		System.out.println("Loan 1 amount is: " + amount);
	}
}

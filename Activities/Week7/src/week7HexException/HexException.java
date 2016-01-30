package week7HexException;

public class HexException 
{
	/*
	 * Implement a hex2Dec method to throw a NumberFormatException if the string is not a hex
	 * string. Define a custom exception called HexFormatException. Implement the hex2Dec
	 * method to throw a HexFormatException if the string is not a hex string.
	 */
	
	public static void main(String[] args) throws HexFormatException
	{
		// Calls hex2Dec method with hex value
		//System.out.println(hex2Dec("AA"));
		//System.out.println(hex2Dec("FAA"));
		//System.out.println(hex2Dec("Z10"));
		//System.out.println(hex2Dec("ABC"));
		System.out.println(hex2Dec("10A"));
	}

	// hex2Dec takes the string value
	public static int hex2Dec(String hexString) throws HexFormatException 
	{
		// value will be the return value of convertHextToDec. 
		// Gives the char from the first index of the string
		int value = convertHexToDec(hexString.charAt(0));

		// Will loop through the string
		for (int i = 1; i < hexString.length(); i++) 
		{
			// value will multiply by 16 then add to the CHAR that matches the index of i
			value = value * 16 + hexString.charAt(i) - '0';
		}
		return value;
	}

	// Method will return a value depending on the first char of the string
	static int convertHexToDec(char ch) throws HexFormatException 
	{
		if (ch == 'A') 
		{
			return 10;
		}
		else if (ch == 'B') 
		{
			return 11;
		}
		else if (ch == 'C') 
		{
			return 12;
		}
		else if (ch == 'D') 
		{
			return 13;
		}
		else if (ch == 'E') 
		{
			return 14;
		}
		else if (ch == 'F') 
		{
			return 15;
		}
		else if (ch <= '9' && ch >= '0')
		{
			return ch - '0';
		}

		// If none of the above are found, an exception will be thrown 
		else{
			throw new HexFormatException("Illegal hex character: " + ch);
		}

	}
}

// Error message for convertHexToDec
class HexFormatException extends Exception 
{
	HexFormatException() 
	{
		super("Illegal hex character");
	}
	
	HexFormatException(String message) 
	{
		super(message);
	}
}

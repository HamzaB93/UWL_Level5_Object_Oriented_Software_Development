package week6Factory;

//Implements the Shape interface
public class Square implements Shape
{
	// Overriding the Shape method
	@Override
	// Using the method
	public void draw()
	{
		System.out.println("Inside Sqaure:: draw() method.");
	}
}
package week6Factory;

public class FactoryPatternDemo {
	public static void main(String[] args) 
	{
		// Creating a ShapeFactory object
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Create a new shape of type Shape. 
		// Will be a reference to the shapeFactory method getShape
		// Here it will create a new circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		// Call draw method of Circle
		shape1.draw();
		
		// Construct another shape, getShape of RECTANGLE... creats new rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		// Call draw method of Rectangle
		shape2.draw();
		
		// Create a new Square with getshape
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		// Call draw method of circle
		shape3.draw();
	}
}

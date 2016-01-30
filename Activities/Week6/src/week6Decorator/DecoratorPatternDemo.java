package week6Decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		
		// Create a new Circle of type Shape
		Shape circle = new Circle();
		
		// Make a circle with RedShapeDecorator circle of type shape
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		// Make a rectangle with RedShapeDecorator circle of type shape
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		// The redCircle uses ShapeDecorator and RedShapeDecorator
		// First will use ShapeDecorator draw() which tell us what shape it is
		// Then it will use draw from RedShapeDecorator and tell us that it has a red border
		redCircle.draw();
		
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}

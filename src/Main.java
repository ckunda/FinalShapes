
public class Main {

	public static void main(String[] args) { 

		/* Psuedocode
		 * 
		 * 	Create a Square shape
		 * 		Calculate the area
		 * 		Print the area
		 * 
		 * 	Create a Circle shape
		 * 		Calculate the area
		 * 		Print the area
		 * 
		 * 	Create a Rectangle shape
		 * 		Calculate the area
		 * 		Print the area
		 * 
		 * 	Create a Triangle shape
		 * 		Calculate the area
		 * 		Print the area
		 */

		Shape square = new Square(5.0f);
		square.calculateArea();
		System.out.println(square.getValue());

		Shape circle = new Circle(5.0f);
		circle.calculateArea();
		System.out.println(circle.getValue());

		Shape rectangle = new Rectangle(5.0f, 5.0f);
		rectangle.calculateArea();
		System.out.println(rectangle.getValue());

		Shape triangle = new Triangle(5.0f, 5.0f);
		triangle.calculateArea();
		System.out.println(triangle.getValue());
	}

	// Another way to print any Shape
	public static void printShape(Shape s) {
		String className = s.getClass().getSimpleName();
		System.out.println("Area of " + className + s.getValue());
	}
}
